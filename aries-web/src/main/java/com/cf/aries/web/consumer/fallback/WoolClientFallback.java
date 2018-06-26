package com.cf.aries.web.consumer.fallback;

import com.cf.aries.common.po.WoolInfo;
import com.cf.aries.common.util.Response;
import com.cf.aries.web.consumer.WoolClient;
import feign.hystrix.FallbackFactory;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * WoolClientFallback
 *
 * @author 于文硕
 * @since 2018/5/15 16:00
 */
@Slf4j
@Component
public class WoolClientFallback implements FallbackFactory<WoolClient> {

    @Override
    public WoolClient create(Throwable cause) {
        return new WoolClient() {
            @Override
            public Response<WoolInfo> getWoolInfoById(Long id) {
                log.error("RPC FALLBACK WoolClient.getWoolInfoById, param is: {},error is :{}", id.toString(), cause);
                return Response.error();
            }

            @Override
            public Response<List<WoolInfo>> getWoolInfos(WoolInfo woolInfo) {
                log.error("RPC FALLBACK WoolClient.getWoolInfos, param is: {},error is :{}", woolInfo.toString(), cause);
                return Response.error();
            }

            @Override
            public Response saveWoolInfo(WoolInfo woolInfo) {
                log.error("RPC FALLBACK WoolClient.saveWoolInfo, param is: {},error is :{}", woolInfo.toString(), cause);
                return Response.error();
            }

            @Override
            public Response deleteWoolInfo(Long id) {
                log.error("RPC FALLBACK WoolClient.deleteWoolInfo, param is: {},error is :{}", id.toString(), cause);
                return Response.error();
            }
        };
    }

}
