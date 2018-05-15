package com.cf.aries.base.business.impl;

import com.cf.aries.base.business.UserBusiness;
import com.cf.aries.base.dbrouter.annotation.Split;
import com.cf.aries.base.service.UserService;
import com.cf.aries.common.enums.CommonEnum;
import com.cf.aries.common.message.UserMessage;
import com.cf.aries.common.po.UserInfo;
import com.cf.aries.common.util.DateUtils;
import com.cf.aries.common.util.EmptyUtils;
import com.cf.aries.common.util.MD5Utils;
import com.cf.aries.common.util.Response;
import com.cf.aries.common.vo.UserInfoVO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;

/**
 * UserBusinessImpl
 *
 * @author 于文硕 yuwenshuo@passiontec.cn
 * @since 2018/5/11 14:01
 */

@Slf4j
@Service
public class UserBusinessImpl implements UserBusiness{

    @Autowired
    private UserService userService;

    @Split("main")
    @Transactional
    @Override
    public Response saveUserInfo(UserInfoVO userInfoVO) {
        UserInfo userInfo = new UserInfo();
        BeanUtils.copyProperties(userInfoVO,userInfo);
        if(EmptyUtils.isEmpty(userInfo.getId())){
            userInfo.setCtime(DateUtils.formatDate(DateUtils.FORMAT_DEFAULT, new Date()));
            userInfo.setUtime(userInfo.getCtime());
            userInfo.setIsDelete(CommonEnum.NORMAL.getCode());
            userService.insertUserInfo(userInfo);

        }else{
            userInfo.setUtime(DateUtils.formatDate(DateUtils.FORMAT_DEFAULT, new Date()));
            userService.updateUserInfo(userInfo);
        }

        return Response.success();
    }

    @Split("main")
    @Override
    public Response getUserInfoById(Long userId) {
        UserInfo userInfo = userService.getUserInfoById(userId);
        return Response.success(userInfo);
    }

    @Split("main")
    @Override
    public Response checkPassword(Long userId, String password) {
        UserInfo userInfo = userService.getUserInfoById(userId);
        if(userInfo == null){
            return Response.error(UserMessage.NO_USER);
        }
        if(!password.equals(userInfo.getPassword())){
            return Response.error(UserMessage.PASSWORD_INVALID);
        }
        return Response.success();
    }
}
