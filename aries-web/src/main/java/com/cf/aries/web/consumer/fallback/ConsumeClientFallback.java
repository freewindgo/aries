package com.cf.aries.web.consumer.fallback;

import com.cf.aries.common.po.ConsumeInfo;
import com.cf.aries.common.po.ConsumeStat;
import com.cf.aries.common.util.Response;
import com.cf.aries.web.consumer.ConsumeClient;
import feign.hystrix.FallbackFactory;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

/**
 * ConsumeClientFallback
 *
 * @author 于文硕 yuwenshuo@passiontec.cn
 * @since 2018/5/15 16:00
 */
@Slf4j
@Component
public class ConsumeClientFallback implements FallbackFactory<ConsumeClient> {

    @Override
    public ConsumeClient create(Throwable cause) {
        return new ConsumeClient() {
            @Override
            public Response<ConsumeInfo> getConsumeInfoById(Long id) {
                log.error("RPC FALLBACK ConsumeClient.getConsumeInfoById, param is: {},error is :{}", id.toString(), cause);
                return Response.error();
            }

            @Override
            public Response getConsumeInfos(ConsumeInfo consumeInfo) {
                log.error("RPC FALLBACK ConsumeClient.getConsumeInfos, param is: {},error is :{}", consumeInfo.toString(), cause);
                return Response.error();
            }

            @Override
            public Response saveConsumeInfo(ConsumeInfo consumeInfo) {
                log.error("RPC FALLBACK ConsumeClient.saveConsumeInfo, param is: {},error is :{}", consumeInfo.toString(), cause);
                return Response.error();
            }

            @Override
            public Response deleteConsumeInfo(Long id) {
                log.error("RPC FALLBACK ConsumeClient.deleteConsumeInfo, param is: {},error is :{}", id.toString(), cause);
                return Response.error();
            }

            @Override
            public Response getConsumeStats(ConsumeStat consumeStat) {
                log.error("RPC FALLBACK ConsumeClient.getConsumeStats, param is: {},error is :{}", consumeStat.toString(), cause);
                return Response.error();
            }

            @Override
            public Response getConsumeStatsForm(Long userId, String startMonth, String endMonth) {
                log.error("RPC FALLBACK ConsumeClient.getConsumeStatsForm, param is: {},error is :{}", userId.toString()+"/"+startMonth.toString()+"/"+endMonth.toString(), cause);
                return Response.error();
            }
        };
    }

}
