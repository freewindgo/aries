package com.cf.aries.base.cron;

import com.cf.aries.base.business.CronBusiness;
import com.cf.aries.base.service.ConsumeService;
import com.cf.aries.base.service.CreditService;
import com.cf.aries.base.service.WoolService;
import com.cf.aries.common.util.DateUtils;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;


/**
 * CouponTask
 *
 * @author 于文硕 yuwenshuo@passiontec.cn
 * @since 2018/5/15 16:06
 */
@Slf4j
@Component
@RestController
public class CronTask {

    @Autowired
    private CronBusiness cronBusiness;

    private static final Integer REAL_DELETE_DAYS = 7;

    /**
     * 每天1点清理数据库中is_delete为2并且删除时间已超过REAL_DELETE_DAYS的数据
     */
    @Scheduled(cron = "0 1 0 * * ? ")
    public void deleteExpireData() {
        try {
            cronBusiness.deleteExpireData(REAL_DELETE_DAYS);
        } catch (Exception e) {
            log.error("cron deleteExpireData error, e:{}", e);
        }
    }


    /**
     * 每天0点30统计数据，存储入consume_stat表
     */
    @Scheduled(cron = "0 30 0 * * ? ")
    public void saveStatInfo() {
        try {
            String lastDay = DateUtils.calDate(DateUtils.FORMAT_FOR_DAWN, new Date(), -1);
            String monthOfLastDay = DateUtils.calDate(DateUtils.FORMAT_FOR_MONTH, new Date(), -1);
            cronBusiness.saveStatInfo(monthOfLastDay, lastDay);
        } catch (Exception e) {
            log.error("cron getStatInfo error, e:{}", e);
        }
    }


}

