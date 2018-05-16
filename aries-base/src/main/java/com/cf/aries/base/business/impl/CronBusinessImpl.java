package com.cf.aries.base.business.impl;

import com.cf.aries.base.business.CronBusiness;
import com.cf.aries.base.service.ConsumeService;
import com.cf.aries.base.service.CreditService;
import com.cf.aries.base.service.WoolService;
import com.cf.aries.common.enums.CommonEnum;
import com.cf.aries.common.po.ConsumeStat;
import com.cf.aries.common.util.DateUtils;
import com.cf.aries.common.util.EmptyUtils;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

/**
 * CronBusinessImpl
 *
 * @author 于文硕 yuwenshuo@passiontec.cn
 * @since 2018/5/16 15:01
 */
@Slf4j
@Service
public class CronBusinessImpl implements CronBusiness{

    @Autowired
    private ConsumeService consumeService;

    @Autowired
    private CreditService creditService;

    @Autowired
    private WoolService woolService;

    @Override
    public void deleteExpireData(Integer days) {
        consumeService.realDelete(days);
        creditService.realDelete(days);
        woolService.realDelete(days);
    }

    @Override
    public void saveStatInfo(String month, String utime) {
        List<ConsumeStat> consumeStatList = consumeService.statConsumeInfo(month,utime);
        if(EmptyUtils.isNotEmpty(consumeStatList)){
            for(ConsumeStat consumeStat : consumeStatList){
                ConsumeStat oldConsumeStat = consumeService.getConsumeStat(consumeStat);
                if(oldConsumeStat != null){
                    oldConsumeStat.setBill(consumeStat.getBill());
                    oldConsumeStat.setSheep(consumeStat.getSheep());
                    oldConsumeStat.setUtime(DateUtils.formatDate(DateUtils.FORMAT_DEFAULT, new Date()));
                    consumeService.updateConsumeStat(oldConsumeStat);
                }else{
                    consumeStat.setCtime(DateUtils.formatDate(DateUtils.FORMAT_DEFAULT, new Date()));
                    consumeStat.setUtime(consumeStat.getCtime());
                    consumeStat.setIsDelete(CommonEnum.NORMAL.getCode());
                    consumeService.insertConsumeStat(consumeStat);
                }
            }
        }
    }
}
