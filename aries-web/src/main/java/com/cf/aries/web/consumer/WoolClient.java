package com.cf.aries.web.consumer;

import com.cf.aries.common.po.WoolInfo;
import com.cf.aries.common.util.Response;
import com.cf.aries.web.consumer.fallback.WoolClientFallback;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

/**
 * CreditClient
 *
 * @author 于文硕
 * @since 2018/5/15 16:00
 */
@FeignClient(value = "${service.aries-base.name}", path = "${service.aries-base.path}", fallbackFactory = WoolClientFallback.class)
public interface WoolClient {

    /**
     * 按id获取
     *
     * @param id
     * @return
     */
    @GetMapping("/wool/getWoolInfoById")
    Response<WoolInfo> getWoolInfoById(@RequestParam("id") Long id);

    /**
     * 按条件获取
     *
     * @param woolInfo
     * @return
     */
    @PostMapping("/wool/getWoolInfos")
    Response<List<WoolInfo>> getWoolInfos(@RequestBody WoolInfo woolInfo);


    /**
     * 存储
     *
     * @param woolInfo
     * @return
     */
    @PostMapping("/wool/saveWoolInfo")
    Response saveWoolInfo(@RequestBody WoolInfo woolInfo);

    /**
     * 删除
     *
     * @param id
     * @return
     */
    @GetMapping("/wool/deleteWoolInfo")
    Response deleteWoolInfo(@RequestParam("id") Long id);

}
