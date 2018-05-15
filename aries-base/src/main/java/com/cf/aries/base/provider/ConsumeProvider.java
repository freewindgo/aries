package com.cf.aries.base.provider;

import com.cf.aries.base.business.ConsumeBusiness;
import com.cf.aries.common.message.ResponseMessage;
import com.cf.aries.common.po.ConsumeInfo;
import com.cf.aries.common.util.EmptyUtils;
import com.cf.aries.common.util.Response;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * ConsumeProvider
 *
 * @author 于文硕 yuwenshuo@passiontec.cn
 * @since 2018/5/15 16:00
 */
@Slf4j
@RestController
@RequestMapping("/consume")
public class ConsumeProvider {
    @Autowired
    private ConsumeBusiness consumeBusiness;

    @GetMapping("/getConsumeInfoById")
    public Response getConsumeInfoById(@RequestParam Long id){
        if(EmptyUtils.isEmpty(id)){
            return Response.error(ResponseMessage.PARAM_ERROR);
        }
        try {
            return consumeBusiness.getConsumeInfoById(id);
        } catch (Exception e) {
            log.error("getConsumeInfoById error, error:{}",e);
            return Response.error();
        }
    }

    @PostMapping("/getConsumeInfos")
    public Response getConsumeInfos(@RequestBody ConsumeInfo consumeInfo){
        try {
            return consumeBusiness.getConsumeInfos(consumeInfo);
        } catch (Exception e) {
            log.error("getConsumeInfos error, error:{}",e);
            return Response.error();
        }
    }

    @PostMapping("/saveConsumeInfo")
    public Response saveConsumeInfo(@RequestBody ConsumeInfo consumeInfo){
        try {
            return consumeBusiness.saveConsumeInfo(consumeInfo);
        } catch (Exception e) {
            log.error("saveConsumeInfo error, error:{}",e);
            return Response.error();
        }
    }

    @GetMapping("/deleteConsumeInfo")
    public Response deleteConsumeInfo(@RequestParam Long id){
        if(EmptyUtils.isEmpty(id)){
            return Response.error(ResponseMessage.PARAM_ERROR);
        }
        try {
            return consumeBusiness.deleteConsumeInfo(id);
        } catch (Exception e) {
            log.error("deleteConsumeInfo error, error:{}",e);
            return Response.error();
        }
    }
}
