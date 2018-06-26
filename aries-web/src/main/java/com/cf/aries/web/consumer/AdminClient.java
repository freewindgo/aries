package com.cf.aries.web.consumer;

import com.cf.aries.common.po.AdminBank;
import com.cf.aries.common.util.Response;
import com.cf.aries.web.consumer.fallback.AdminClientFallback;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

/**
 * AdminClient
 *
 * @author 于文硕
 * @since 2018/5/15 16:00
 */
@FeignClient(value = "${service.aries-base.name}", path = "${service.aries-base.path}", fallbackFactory = AdminClientFallback.class)
public interface AdminClient {

    /**
     * 获取bank列表
     *
     * @return
     */
    @GetMapping("/admin/getAllBank")
    Response<List<AdminBank>> getAllBank();


}
