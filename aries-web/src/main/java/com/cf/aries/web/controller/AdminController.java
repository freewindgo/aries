package com.cf.aries.web.controller;

import com.cf.aries.common.po.AdminBank;
import com.cf.aries.common.util.Response;
import com.cf.aries.web.consumer.AdminClient;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * AdminController
 *
 * @author 于文硕 yuwenshuo@passiontec.cn
 * @since 2018/5/18 9:41
 */

@Slf4j
@RestController
@RequestMapping("/admin")
public class AdminController {

    @Autowired
    private AdminClient adminClient;

    /**
     * 获取全部银行列表
     *
     * @return
     */
    @GetMapping("/getAllBank")
    public Response<AdminBank> getAllBank() {
        try {
            return adminClient.getAllBank();
        } catch (Exception e) {
            log.error("AdminController.getAllBank error, error is {}", e);
            return Response.error();
        }
    }


}
