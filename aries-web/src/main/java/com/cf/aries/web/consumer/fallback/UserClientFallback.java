package com.cf.aries.web.consumer.fallback;

import com.cf.aries.common.po.UserInfo;
import com.cf.aries.common.util.Response;
import com.cf.aries.web.consumer.UserClient;
import feign.hystrix.FallbackFactory;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

/**
 * UserClientFallback
 *
 * @author 于文硕 yuwenshuo@passiontec.cn
 * @since 2018/5/15 16:00
 */
@Slf4j
@Component
public class UserClientFallback implements FallbackFactory<UserClient> {

    @Override
    public UserClient create(Throwable cause) {
        return new UserClient() {
            @Override
            public Response<UserInfo> getUserInfoById(Long id) {
                log.error("RPC FALLBACK UserClient.getUserInfoById, param is: {},error is :{}", id.toString(), cause);
                return Response.error();
            }

            @Override
            public Response saveUserInfo(UserInfo userInfo) {
                log.error("RPC FALLBACK UserClient.saveUserInfo, param is: {},error is :{}", userInfo.toString(), cause);
                return Response.error();
            }

            @Override
            public Response<Boolean> checkPassword(Long id, String password) {
                log.error("RPC FALLBACK UserClient.checkPassword, param is: {},error is :{}", id.toString() + "/" + password.toString(), cause);
                return Response.error();
            }
        };
    }

}
