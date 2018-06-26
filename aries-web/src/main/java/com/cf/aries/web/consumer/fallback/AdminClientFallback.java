package com.cf.aries.web.consumer.fallback;

import com.cf.aries.common.po.AdminBank;
import com.cf.aries.common.po.UserInfo;
import com.cf.aries.common.util.Response;
import com.cf.aries.web.consumer.AdminClient;
import com.cf.aries.web.consumer.UserClient;
import feign.hystrix.FallbackFactory;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * AdminClientFallback
 *
 * @author 于文硕
 * @since 2018/5/15 16:00
 */
@Slf4j
@Component
public class AdminClientFallback implements FallbackFactory<AdminClient> {

    @Override
    public AdminClient create(Throwable cause) {
        return new AdminClient() {
            @Override
            public Response<List<AdminBank>> getAllBank() {
                log.error("RPC FALLBACK AdminClient.getAllBank,error is :{}", cause);
                return Response.error();
            }
        };
    }

}
