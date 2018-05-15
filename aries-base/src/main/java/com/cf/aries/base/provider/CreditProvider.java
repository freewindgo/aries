package com.cf.aries.base.provider;

import com.cf.aries.base.business.CreditBusiness;
import com.cf.aries.common.message.ResponseMessage;
import com.cf.aries.common.po.CreditCard;
import com.cf.aries.common.util.EmptyUtils;
import com.cf.aries.common.util.Response;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * CreditProvider
 *
 * @author 于文硕 yuwenshuo@passiontec.cn
 * @since 2018/5/15 15:04
 */
@Slf4j
@RestController
@RequestMapping("/credit")
public class CreditProvider {

    @Autowired
    private CreditBusiness creditBusiness;

    @GetMapping("/getCreditCardById")
    public Response getCreditCardById(@RequestParam Long id){
        if(EmptyUtils.isEmpty(id)){
            return Response.error(ResponseMessage.PARAM_ERROR);
        }
        try {
            return creditBusiness.getCreditCardById(id);
        } catch (Exception e) {
            log.error("getCreditCardById error, error:{}",e);
            return Response.error();
        }
    }

    @PostMapping("/getCreditCards")
    public Response getCreditCards(@RequestBody CreditCard creditCard){
        try {
            return creditBusiness.getCreditCards(creditCard);
        } catch (Exception e) {
            log.error("getCreditCards error, error:{}",e);
            return Response.error();
        }
    }

    @PostMapping("/saveCreditCard")
    public Response saveCreditCard(@RequestBody CreditCard creditCard){
        try {
            return creditBusiness.saveCreditCard(creditCard);
        } catch (Exception e) {
            log.error("saveCreditCard error, error:{}",e);
            return Response.error();
        }
    }

    @GetMapping("/deleteCreditCard")
    public Response deleteCreditCard(@RequestParam Long id){
        if(EmptyUtils.isEmpty(id)){
            return Response.error(ResponseMessage.PARAM_ERROR);
        }
        try {
            return creditBusiness.deleteCreditCard(id);
        } catch (Exception e) {
            log.error("deleteCreditCard error, error:{}",e);
            return Response.error();
        }
    }


}
