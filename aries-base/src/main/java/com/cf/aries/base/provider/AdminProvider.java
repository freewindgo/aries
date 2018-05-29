package com.cf.aries.base.provider;

import com.cf.aries.base.business.AdminBusiness;
import com.cf.aries.common.util.Response;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * AdminProvider
 *
 * @author 于文硕 yuwenshuo@passiontec.cn
 * @since 2018/5/29 16:30
 */
@Slf4j
@RestController
@RequestMapping("/admin")
public class AdminProvider {
    @Autowired
    private AdminBusiness adminBusiness;


    @GetMapping("/getAllBank")
    public Response getAllBank(){
        try {
            return adminBusiness.getAllBank();
        } catch (Exception e) {
            log.error("getAllBank error, error:{}",e);
            return Response.error();
        }
    }

}
