package com.cf.aries.base.provider;

import com.cf.aries.base.business.ConsumeBusiness;
import com.cf.aries.common.message.ResponseMessage;
import com.cf.aries.common.po.ConsumeInfo;
import com.cf.aries.common.po.ConsumeStat;
import com.cf.aries.common.util.EmptyUtils;
import com.cf.aries.common.util.Response;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * ConsumeProvider
 *
 * @author 于文硕
 * @since 2018/5/15 16:00
 */
@Slf4j
@RestController
@RequestMapping("/consume")
public class ConsumeProvider {
    @Autowired
    private ConsumeBusiness consumeBusiness;

    /**
     * 按id获取consumeInfo
     *
     * @param id
     * @return
     */
    @GetMapping("/getConsumeInfoById")
    public Response getConsumeInfoById(@RequestParam Long id) {
        if (EmptyUtils.isEmpty(id)) {
            return Response.error(ResponseMessage.PARAM_ERROR);
        }
        try {
            return consumeBusiness.getConsumeInfoById(id);
        } catch (Exception e) {
            log.error("getConsumeInfoById error, error:{}", e);
            return Response.error();
        }
    }

    /**
     * 获取consumeInfo列表 分页
     *
     * @param consumeInfo
     * @return
     */
    @PostMapping("/getConsumeInfos")
    public Response getConsumeInfos(@RequestBody ConsumeInfo consumeInfo) {
        try {
            return consumeBusiness.getConsumeInfos(consumeInfo);
        } catch (Exception e) {
            log.error("getConsumeInfos error, error:{}", e);
            return Response.error();
        }
    }

    /**
     * 保存consumeInfo
     *
     * @param consumeInfo
     * @return
     */
    @PostMapping("/saveConsumeInfo")
    public Response saveConsumeInfo(@RequestBody ConsumeInfo consumeInfo) {
        try {
            return consumeBusiness.saveConsumeInfo(consumeInfo);
        } catch (Exception e) {
            log.error("saveConsumeInfo error, error:{}", e);
            return Response.error();
        }
    }

    /**
     * 删除consumeInfo
     *
     * @param id
     * @return
     */
    @GetMapping("/deleteConsumeInfo")
    public Response deleteConsumeInfo(@RequestParam Long id) {
        if (EmptyUtils.isEmpty(id)) {
            return Response.error(ResponseMessage.PARAM_ERROR);
        }
        try {
            return consumeBusiness.deleteConsumeInfo(id);
        } catch (Exception e) {
            log.error("deleteConsumeInfo error, error:{}", e);
            return Response.error();
        }
    }

    /**
     * 获取报告列表
     *
     * @param consumeStat
     * @return
     */
    @PostMapping("/getConsumeStats")
    public Response getConsumeStats(@RequestBody ConsumeStat consumeStat) {
        try {
            return consumeBusiness.getConsumeStats(consumeStat);
        } catch (Exception e) {
            log.error("getConsumeStats error, error:{}", e);
            return Response.error();
        }
    }

    /**
     * 获取首页报告，图表展示
     *
     * @param userId
     * @param startMonth
     * @param endMonth
     * @return
     */
    @GetMapping("/getConsumeStatsForm")
    public Response getConsumeStatsForm(@RequestParam Long userId, @RequestParam String startMonth, @RequestParam String endMonth) {
        try {
            return consumeBusiness.getConsumeStatsForm(userId, startMonth, endMonth);
        } catch (Exception e) {
            log.error("getConsumeStatsForm error, error:{}", e);
            return Response.error();
        }
    }
}
