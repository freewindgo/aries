package com.cf.aries.base.business.impl;

import com.cf.aries.base.business.UserBusiness;
import com.cf.aries.base.service.UserService;
import com.cf.aries.common.enums.CommonEnum;
import com.cf.aries.common.message.UserMessage;
import com.cf.aries.common.po.UserInfo;
import com.cf.aries.common.util.*;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * UserBusinessImpl
 *
 * @author 于文硕
 * @since 2018/5/11 14:01
 */

@Slf4j
@Service
public class UserBusinessImpl implements UserBusiness {

    @Autowired
    private UserService userService;

    private final String OPENID_INTERFACE = "https://api.weixin.qq.com/sns/jscode2session";
    private final String APP_ID = "wx0c75033acddfca71";
    private final String APP_SECRET = "44fd872f6fa5a65ee422b8530f5a2ccb";

    @Transactional
    @Override
    public Response saveUserInfo(UserInfo userInfo) {
        //id为空说明为新用户登陆，或者页面缓存已失效
        if (EmptyUtils.isEmpty(userInfo.getId())){

            String openId = this.getOpenIdFromWx(userInfo.getCode());
            if(EmptyUtils.isEmpty(openId)){
                return Response.error(UserMessage.GET_OPENID_FAILED);
            }
            UserInfo userInfoFromDB = userService.getUserInfoByOpenId(openId);

            //不为空说明是页面缓存失效,返回用户数据
            if(userInfoFromDB != null){
                return Response.success(userInfoFromDB);
            }

            //为空则进行新增数据
            userInfo.setOpenId(openId);
            userInfo.setCtime(DateUtils.formatDate(DateUtils.FORMAT_DEFAULT, new Date()));
            userInfo.setUtime(userInfo.getCtime());
            userInfo.setIsDelete(CommonEnum.NORMAL.getCode());
            userInfo.setIsPrivate(CommonEnum.NO.getCode());

            //将记录得id进行赋值并返回
            Long id = userService.insertUserInfo(userInfo);
            userInfo.setId(id);

        } else {
            userInfo.setUtime(DateUtils.formatDate(DateUtils.FORMAT_DEFAULT, new Date()));
            userService.updateUserInfo(userInfo);
        }

        return Response.success(userInfo);
    }

    @Override
    public Response getUserInfoById(Long userId) {
        UserInfo userInfo = userService.getUserInfoById(userId);
        if (userInfo == null) {
            return Response.error(UserMessage.NO_USER);
        }
        return Response.success(userInfo);
    }

    @Override
    public Response checkPassword(Long userId, String password) {
        UserInfo userInfo = userService.getUserInfoById(userId);
        if (userInfo == null) {
            return Response.error(UserMessage.NO_USER);
        }
        if (!password.equals(userInfo.getPassword())) {
            return Response.success(false);
        }
        return Response.success(true);
    }

    /**
     * 根据code从微信后台获取openId
     * @param code
     * @return
     */
    private String getOpenIdFromWx(String code){

        Map<String, String> param = new HashMap();
        param.put("appid",APP_ID);
        param.put("secret", APP_SECRET);
        param.put("js_code", code);
        param.put("grant_type","authorization_code");
        String resultStr = HttpClientUtils.doGet(OPENID_INTERFACE, param);

        log.info("UserBusinessImpl.getOpenIdFromWx, code is {}, result is {}", code, resultStr);
        Map<String, Object> resultMap = JsonUtils.parseMap(resultStr);
        if(EmptyUtils.isEmpty(resultMap) || EmptyUtils.isEmpty(resultMap.get("openid"))){
            return null;
        }

        return resultMap.get("openid").toString();
    }


}
