package com.cf.aries.web.consumer;

import com.cf.aries.common.po.UserInfo;
import com.cf.aries.common.util.Response;
import com.cf.aries.web.consumer.fallback.UserClientFallback;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * UserClient
 *
 * @author 于文硕 yuwenshuo@passiontec.cn
 * @since 2018/5/15 16:00
 */
@FeignClient(value = "${service.aries-base.name}", path = "${service.aries-base.path}", fallbackFactory = UserClientFallback.class)
public interface UserClient {

    /**
     * 通过id获取用户信息
     *
     * @param id
     * @return
     */
    @GetMapping("/user/getUserInfoById")
    Response<UserInfo> getUserInfoById(@RequestParam("id") Long id);

    /**
     * 保存用户信息
     *
     * @param userInfo
     * @return
     */
    @PostMapping("/user/saveUserInfo")
    Response saveUserInfo(@RequestBody UserInfo userInfo);

    /**
     * 密码校验
     *
     * @param id
     * @param password
     * @return
     */
    @GetMapping("/user/checkPassword")
    Response<Boolean> checkPassword(@RequestParam("id") Long id, @RequestParam("password") String password);

}
