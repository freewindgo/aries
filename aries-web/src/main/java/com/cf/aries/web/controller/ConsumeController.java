package com.cf.aries.web.controller;

import com.cf.aries.common.po.ConsumeInfo;
import com.cf.aries.common.po.ConsumeStat;
import com.cf.aries.common.util.Response;
import com.cf.aries.web.consumer.ConsumeClient;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * ConsumeController
 *
 * @author 于文硕 yuwenshuo@passiontec.cn
 * @since 2018/5/18 9:41
 */

@Slf4j
@RestController
@RequestMapping("/consume")
public class ConsumeController {

    @Autowired
    private ConsumeClient consumeClient;

    /**
     * 按id获取
     *
     * @param id
     * @return
     */
    @GetMapping("/getConsumeInfoById")
    public Response<ConsumeInfo> getConsumeInfoById(@RequestParam("id") Long id) {
        try {
            return consumeClient.getConsumeInfoById(id);
        } catch (Exception e) {
            log.error("ConsumeController.getConsumeInfoById error, param is {}, error is {}", id.toString(), e);
            return Response.error();
        }
    }

    /**
     * 按条件获取，分页
     *
     * @param consumeInfo
     * @return
     */
    @PostMapping("/getConsumeInfos")
    public Response<List<ConsumeInfo>> getConsumeInfos(@RequestBody ConsumeInfo consumeInfo) {
        try {
            return consumeClient.getConsumeInfos(consumeInfo);
        } catch (Exception e) {
            log.error("ConsumeController.getConsumeInfos error, param is {}, error is {}", consumeInfo.toString(), e);
            return Response.error();
        }
    }


    /**
     * 存储
     *
     * @param consumeInfo
     * @return
     */
    @PostMapping("/saveConsumeInfo")
    public Response saveConsumeInfo(@RequestBody ConsumeInfo consumeInfo) {
        try {
            return consumeClient.saveConsumeInfo(consumeInfo);
        } catch (Exception e) {
            log.error("ConsumeController.saveConsumeInfo error, param is {}, error is {}", consumeInfo.toString(), e);
            return Response.error();
        }
    }

    /**
     * 删除
     *
     * @param id
     * @return
     */
    @GetMapping("/deleteConsumeInfo")
    public Response deleteConsumeInfo(@RequestParam("id") Long id) {
        try {
            return consumeClient.deleteConsumeInfo(id);
        } catch (Exception e) {
            log.error("ConsumeController.deleteConsumeInfo error, param is {}, error is {}", id.toString(), e);
            return Response.error();        }
    }

    /**
     * 报告列表
     *
     * @param consumeStat
     * @return
     */
    @PostMapping("/getConsumeStats")
    public Response<List<ConsumeStat>> getConsumeStats(@RequestBody ConsumeStat consumeStat) {
        try {
            return consumeClient.getConsumeStats(consumeStat);
        } catch (Exception e) {
            log.error("ConsumeController.getConsumeStats error, param is {}, error is {}", consumeStat.toString(), e);
            return Response.error();
        }
    }

    /**
     * 首页图表
     *
     * @param userId
     * @param startMonth
     * @param endMonth
     * @return
     */
    @GetMapping("/getConsumeStatsForm")
    public Response<List<ConsumeStat>> getConsumeStatsForm(@RequestParam("userId") Long userId
            , @RequestParam("startMonth") String startMonth
            , @RequestParam("endMonth") String endMonth) {
        try {
            return consumeClient.getConsumeStatsForm(userId, startMonth, endMonth);
        } catch (Exception e) {
            log.error("ConsumeController.getConsumeStatsForm error, param is {}, error is {}", userId.toString()+"/"+startMonth+"/"+endMonth, e);
            return Response.error();
        }
    }

}
