package com.cf.aries.web.consumer.fallback;

import com.cf.aries.common.po.CreditCard;
import com.cf.aries.common.util.Response;
import com.cf.aries.web.consumer.CreditClient;
import feign.hystrix.FallbackFactory;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * CreditClientFallback
 *
 * @author 于文硕 yuwenshuo@passiontec.cn
 * @since 2018/5/15 16:00
 */
@Slf4j
@Component
public class CreditClientFallback implements FallbackFactory<CreditClient> {

    @Override
    public CreditClient create(Throwable cause) {
        return new CreditClient() {
            @Override
            public Response<CreditCard> getCreditCardById(Long id) {
                log.error("RPC FALLBACK CreditClient.getCreditCardById, param is: {},error is :{}", id.toString(), cause);
                return Response.error();
            }

            @Override
            public Response<List<CreditCard>> getCreditCards(CreditCard creditCard) {
                log.error("RPC FALLBACK CreditClient.getCreditCards, param is: {},error is :{}", creditCard.toString(), cause);
                return Response.error();
            }

            @Override
            public Response saveCreditCard(CreditCard creditCard) {
                log.error("RPC FALLBACK CreditClient.saveCreditCard, param is: {},error is :{}", creditCard.toString(), cause);
                return Response.error();
            }

            @Override
            public Response deleteCreditCard(Long id) {
                log.error("RPC FALLBACK CreditClient.deleteCreditCard, param is: {},error is :{}", id.toString(), cause);
                return Response.error();
            }

            @Override
            public Response<CreditCard> creditAdvice(Long userId) {
                log.error("RPC FALLBACK CreditClient.creditAdvice, param is: {},error is :{}", userId.toString(), cause);
                return Response.error();
            }
        };
    }

}
