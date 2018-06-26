package com.cf.aries.base.service;

import com.cf.aries.common.po.ConsumeInfo;
import com.cf.aries.common.po.ConsumeStat;

import java.util.List;

/**
 * ConsumeService
 *
 * @author 于文硕
 * @since 2018/5/15 16:05
 */
public interface ConsumeService {

    ConsumeInfo getConsumeInfoById(Long consumeId);

    List<ConsumeInfo> getConsumeInfos(ConsumeInfo consumeInfo);

    int getConsumeInfoTotal(ConsumeInfo consumeInfo);

    int insertConsumeInfo(ConsumeInfo consumeInfo);

    int updateConsumeInfo(ConsumeInfo consumeInfo);

    int realDelete(Integer days);

    List<ConsumeStat> statConsumeInfo(String month, String utime);

    int insertConsumeStat(ConsumeStat consumeStat);

    int updateConsumeStat(ConsumeStat consumeStat);

    ConsumeStat getConsumeStat(ConsumeStat consumeStat);

    List<ConsumeStat> getConsumeStats(ConsumeStat consumeStat);

    List<ConsumeStat> getConsumeStatsForm(Long userId, String startMonth, String endMonth);

    int countByUserId(Long userId);
}
