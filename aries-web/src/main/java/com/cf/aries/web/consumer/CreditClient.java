package com.cf.aries.web.consumer;

import com.cf.aries.common.po.CreditCard;
import com.cf.aries.common.util.Response;
import com.cf.aries.common.vo.SummaryInfo;
import com.cf.aries.web.consumer.fallback.CreditClientFallback;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

/**
 * CreditClient
 *
 * @author 于文硕 yuwenshuo@passiontec.cn
 * @since 2018/5/15 16:00
 */
@FeignClient(value = "${service.aries-base.name}", path = "${service.aries-base.path}", fallbackFactory = CreditClientFallback.class)
public interface CreditClient {

    /**
     * 按id获取
     *
     * @param id
     * @return
     */
    @GetMapping("/credit/getCreditCardById")
    Response<CreditCard> getCreditCardById(@RequestParam("id") Long id);

    /**
     * 按条件获取
     *
     * @param creditCard
     * @return
     */
    @PostMapping("/credit/getCreditCards")
    Response<List<CreditCard>> getCreditCards(@RequestBody CreditCard creditCard);


    /**
     * 存储
     *
     * @param creditCard
     * @return
     */
    @PostMapping("/credit/saveCreditCard")
    Response saveCreditCard(@RequestBody CreditCard creditCard);

    /**
     * 删除
     *
     * @param id
     * @return
     */
    @GetMapping("/credit/deleteCreditCard")
    Response deleteCreditCard(@RequestParam("id") Long id);

    /**
     * 获取总览中各项数据
     * @param userId
     * @return
     */
    @GetMapping("/credit/summaryInfo")
    Response<SummaryInfo> summaryInfo(@RequestParam("userId") Long userId);

}
