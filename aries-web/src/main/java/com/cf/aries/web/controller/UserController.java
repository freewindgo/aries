package com.cf.aries.web.controller;

import com.cf.aries.common.po.UserInfo;
import com.cf.aries.common.util.Response;
import com.cf.aries.web.consumer.UserClient;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * UserController
 *
 * @author 于文硕
 * @since 2018/5/18 9:41
 */

@Slf4j
@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserClient userClient;

    /**
     * 通过id获取用户信息
     *
     * @param id
     * @return
     */
    @GetMapping("/getUserInfoById")
    public Response<UserInfo> getUserInfoById(@RequestParam("id") Long id) {
        try {
            return userClient.getUserInfoById(id);
        } catch (Exception e) {
            log.error("UserController.getUserInfoById error, param is {}, error is {}", id.toString(), e);
            return Response.error();
        }
    }

    /**
     * 保存用户信息
     *
     * @param userInfo
     * @return
     */
    @PostMapping("/saveUserInfo")
    public Response<UserInfo> saveUserInfo(@RequestBody UserInfo userInfo) {
        try {
            return userClient.saveUserInfo(userInfo);
        } catch (Exception e) {
            log.error("UserController.saveUserInfo error, param is {}, error is {}", userInfo.toString(), e);
            return Response.error();
        }
    }

    /**
     * 密码校验
     *
     * @param id
     * @param password
     * @return
     */
    @GetMapping("/checkPassword")
    public Response<Boolean> checkPassword(@RequestParam("id") Long id, @RequestParam("password") String password) {
        try {
            return userClient.checkPassword(id, password);
        } catch (Exception e) {
            log.error("UserController.checkPassword error, param is {}, error is {}", id.toString()+"/"+password, e);
            return Response.error();
        }
    }
}
