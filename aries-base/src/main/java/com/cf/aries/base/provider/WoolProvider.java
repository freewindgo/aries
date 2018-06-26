package com.cf.aries.base.provider;

import com.cf.aries.base.business.WoolBusiness;
import com.cf.aries.common.message.ResponseMessage;
import com.cf.aries.common.po.WoolInfo;
import com.cf.aries.common.util.EmptyUtils;
import com.cf.aries.common.util.Response;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * WoolProvider
 *
 * @author 于文硕
 * @since 2018/5/16 11:46
 */

@Slf4j
@RestController
@RequestMapping("/wool")
public class WoolProvider {
    
    @Autowired
    private WoolBusiness woolBusiness;

    @GetMapping("/getWoolInfoById")
    public Response getWoolInfoById(@RequestParam Long id){
        if(EmptyUtils.isEmpty(id)){
            return Response.error(ResponseMessage.PARAM_ERROR);
        }
        try {
            return woolBusiness.getWoolInfoById(id);
        } catch (Exception e) {
            log.error("getWoolInfoById error, error:{}",e);
            return Response.error();
        }
    }

    @PostMapping("/getWoolInfos")
    public Response getWoolInfos(@RequestBody WoolInfo woolInfo){
        try {
            return woolBusiness.getWoolInfos(woolInfo);
        } catch (Exception e) {
            log.error("getWoolInfos error, error:{}",e);
            return Response.error();
        }
    }

    @PostMapping("/saveWoolInfo")
    public Response saveWoolInfo(@RequestBody WoolInfo woolInfo){
        try {
            return woolBusiness.saveWoolInfo(woolInfo);
        } catch (Exception e) {
            log.error("saveWoolInfo error, error:{}",e);
            return Response.error();
        }
    }

    @GetMapping("/deleteWoolInfo")
    public Response deleteWoolInfo(@RequestParam Long id){
        if(EmptyUtils.isEmpty(id)){
            return Response.error(ResponseMessage.PARAM_ERROR);
        }
        try {
            return woolBusiness.deleteWoolInfo(id);
        } catch (Exception e) {
            log.error("deleteWoolInfo error, error:{}",e);
            return Response.error();
        }
    }
}
