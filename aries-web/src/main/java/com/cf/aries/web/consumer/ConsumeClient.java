package com.cf.aries.web.consumer;

import com.cf.aries.common.po.ConsumeInfo;
import com.cf.aries.common.po.ConsumeStat;
import com.cf.aries.common.util.Response;
import com.cf.aries.web.consumer.fallback.ConsumeClientFallback;
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
@FeignClient(value = "${service.aries-base.name}", path = "${service.aries-base.path}", fallbackFactory = ConsumeClientFallback.class)
public interface ConsumeClient {

    /**
     * 按id获取
     *
     * @param id
     * @return
     */
    @GetMapping("/consume/getConsumeInfoById")
    Response<ConsumeInfo> getConsumeInfoById(@RequestParam("id") Long id);

    /**
     * 按条件获取，分页
     *
     * @param consumeInfo
     * @return
     */
    @PostMapping("/consume/getConsumeInfos")
    Response<List<ConsumeInfo>> getConsumeInfos(@RequestBody ConsumeInfo consumeInfo);


    /**
     * 存储
     *
     * @param consumeInfo
     * @return
     */
    @PostMapping("/consume/saveConsumeInfo")
    Response saveConsumeInfo(@RequestBody ConsumeInfo consumeInfo);

    /**
     * 删除
     *
     * @param id
     * @return
     */
    @GetMapping("/consume/deleteConsumeInfo")
    Response deleteConsumeInfo(@RequestParam("id") Long id);

    /**
     * 报告列表
     *
     * @param consumeStat
     * @return
     */
    @PostMapping("/consume/getConsumeStats")
    Response<List<ConsumeStat>> getConsumeStats(@RequestBody ConsumeStat consumeStat);

    /**
     * 首页图表
     *
     * @param userId
     * @param startMonth
     * @param endMonth
     * @return
     */
    @GetMapping("/consume/getConsumeStatsForm")
    Response<List<ConsumeStat>> getConsumeStatsForm(@RequestParam("userId") Long userId, @RequestParam("startMonth") String startMonth, @RequestParam("endMonth") String endMonth);

}
