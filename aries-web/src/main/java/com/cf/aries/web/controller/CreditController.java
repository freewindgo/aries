package com.cf.aries.web.controller;

import com.cf.aries.common.po.CreditCard;
import com.cf.aries.common.util.Response;
import com.cf.aries.common.vo.SummaryInfo;
import com.cf.aries.web.consumer.CreditClient;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * CreditController
 *
 * @author 于文硕 yuwenshuo@passiontec.cn
 * @since 2018/5/18 9:42
 */

@Slf4j
@RestController
@RequestMapping("/credit")
public class CreditController {

    @Autowired
    private CreditClient creditClient;
    /**
     * 按id获取
     *
     * @param id
     * @return
     */
    @GetMapping("/getCreditCardById")
    public Response<CreditCard> getCreditCardById(@RequestParam("id") Long id){
        try {
            return creditClient.getCreditCardById(id);
        } catch (Exception e) {
            log.error("CreditController.getCreditCardById error, param is {}, error is {}", id.toString(), e);
            return Response.error();
        }
    }

    /**
     * 按条件获取
     *
     * @param creditCard
     * @return
     */
    @PostMapping("/getCreditCards")
    public Response<List<CreditCard>> getCreditCards(@RequestBody CreditCard creditCard){
        try {
            return creditClient.getCreditCards(creditCard);
        } catch (Exception e) {
            log.error("CreditController.getCreditCards error, param is {}, error is {}", creditCard.toString(), e);
            return Response.error();
        }
    }


    /**
     * 存储
     *
     * @param creditCard
     * @return
     */
    @PostMapping("/saveCreditCard")
    public Response saveCreditCard(@RequestBody CreditCard creditCard){
        try {
            return creditClient.saveCreditCard(creditCard);
        } catch (Exception e) {
            log.error("CreditController.saveCreditCard error, param is {}, error is {}", creditCard.toString(), e);
            return Response.error();
        }
    }

    /**
     * 删除
     *
     * @param id
     * @return
     */
    @GetMapping("/deleteCreditCard")
    public Response deleteCreditCard(@RequestParam("id") Long id){
        try {
            return creditClient.deleteCreditCard(id);
        } catch (Exception e) {
            log.error("CreditController.saveCreditCard error, param is {}, error is {}", id.toString(), e);
            return Response.error();
        }
    }

    /**
     * 获取纵览数据
     * @param userId
     * @return
     */
    @GetMapping("/summaryInfo")
    public Response<SummaryInfo> summaryInfo(@RequestParam Long userId){
        try {
            return creditClient.summaryInfo(userId);
        } catch (Exception e) {
            log.error("CreditController.creditAdvice error, param is {}, error is {}", userId.toString(), e);
            return Response.error();
        }
    }
}
