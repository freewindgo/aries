package com.cf.aries.base.provider;

import com.cf.aries.base.business.UserBusiness;
import com.cf.aries.common.message.ResponseMessage;
import com.cf.aries.common.po.UserInfo;
import com.cf.aries.common.util.EmptyUtils;
import com.cf.aries.common.util.Response;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * UserProvider
 *
 * @author 于文硕 yuwenshuo@passiontec.cn
 * @since 2018/5/11 13:48
 */

@Slf4j
@RestController
@RequestMapping("/user")
public class UserProvider {

    @Autowired
    private UserBusiness userBusiness;


    @GetMapping("/getUserInfoById")
    public Response getUserInfoById(@RequestParam Long id){
        if(EmptyUtils.isEmpty(id)){
            return Response.error(ResponseMessage.PARAM_ERROR);
        }
        try {
            return userBusiness.getUserInfoById(id);
        } catch (Exception e) {
            log.error("getUserInfoById error, error:{}",e);
            return Response.error();
        }
    }

    @PostMapping("/saveUserInfo")
    public Response saveUserInfo(@RequestBody UserInfo userInfo){
        try {
            return userBusiness.saveUserInfo(userInfo);
        } catch (Exception e) {
            log.error("saveUserInfo error, error:{}",e);
            return Response.error();
        }
    }

    @GetMapping("/checkPassword")
    public Response checkPassword(@RequestParam Long id, @RequestParam String password){
        if(EmptyUtils.isEmpty(id) && EmptyUtils.isEmpty(password)){
            return Response.error(ResponseMessage.PARAM_ERROR);
        }
        try {
            return userBusiness.checkPassword(id,password);
        } catch (Exception e) {
            log.error("checkPassword error, error:{}",e);
            return Response.error();
        }
    }

}
