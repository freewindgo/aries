package com.cf.aries.base.business;

import com.cf.aries.common.po.ConsumeInfo;
import com.cf.aries.common.po.ConsumeStat;
import com.cf.aries.common.util.Response;

/**
 * ConsumeBusiness
 *
 * @author 于文硕 yuwenshuo@passiontec.cn
 * @since 2018/5/15 16:09
 */
public interface ConsumeBusiness {

    Response saveConsumeInfo(ConsumeInfo consumeInfo);

    Response getConsumeInfoById(Long consumeId);

    Response getConsumeInfos(ConsumeInfo consumeInfo);

    Response deleteConsumeInfo(Long consumeId);

    Response getConsumeStats(ConsumeStat consumeStat);

    Response getConsumeStatsForm(Long userId, String startMonth, String endMonth);

}
