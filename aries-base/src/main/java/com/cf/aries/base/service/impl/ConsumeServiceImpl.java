package com.cf.aries.base.service.impl;

import com.cf.aries.base.dao.ConsumeInfoMapper;
import com.cf.aries.base.dao.ConsumeStatMapper;
import com.cf.aries.base.service.ConsumeService;
import com.cf.aries.common.enums.CommonEnum;
import com.cf.aries.common.po.ConsumeInfo;
import com.cf.aries.common.po.ConsumeInfoExample;
import com.cf.aries.common.po.ConsumeStat;
import com.cf.aries.common.po.ConsumeStatExample;
import com.cf.aries.common.util.DateUtils;
import com.cf.aries.common.util.EmptyUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

/**
 * ConsumeServiceImpl
 *
 * @author 于文硕 yuwenshuo@passiontec.cn
 * @since 2018/5/15 16:06
 */
@Service
public class ConsumeServiceImpl implements ConsumeService {

    @Autowired
    private ConsumeInfoMapper consumeInfoMapper;

    @Autowired
    private ConsumeStatMapper consumeStatMapper;

    @Override
    public ConsumeInfo getConsumeInfoById(Long consumeId) {
        return consumeInfoMapper.selectByPrimaryKey(consumeId);
    }

    @Override
    public List<ConsumeInfo> getConsumeInfos(ConsumeInfo consumeInfo) {
        return consumeInfoMapper.selectByCondition(consumeInfo);
    }

    @Override
    public int getConsumeInfoTotal(ConsumeInfo consumeInfo) {
        return consumeInfoMapper.countByCondition(consumeInfo);
    }

    @Override
    public int insertConsumeInfo(ConsumeInfo consumeInfo) {
        return consumeInfoMapper.insertSelective(consumeInfo);
    }

    @Override
    public int updateConsumeInfo(ConsumeInfo consumeInfo) {
        return consumeInfoMapper.updateByPrimaryKeySelective(consumeInfo);
    }

    @Override
    public int realDelete(Integer days) {
        String dateCondition = DateUtils.calDate(DateUtils.FORMAT_DEFAULT, new Date(), days);
        ConsumeInfoExample consumeInfoExample = new ConsumeInfoExample();
        consumeInfoExample.createCriteria()
                .andUtimeLessThan(dateCondition)
                .andIsDeleteEqualTo(CommonEnum.DELETED.getCode());
        return consumeInfoMapper.deleteByExample(consumeInfoExample);
    }

    @Override
    public List<ConsumeStat> statConsumeInfo(String month, String utime) {
        return consumeInfoMapper.getConsumeStat(month, utime);
    }

    @Override
    public int insertConsumeStat(ConsumeStat consumeStat) {
        return consumeStatMapper.insertSelective(consumeStat);
    }

    @Override
    public int updateConsumeStat(ConsumeStat consumeStat) {
        return consumeStatMapper.updateByPrimaryKeySelective(consumeStat);
    }

    @Override
    public ConsumeStat getConsumeStat(ConsumeStat consumeStat) {
        ConsumeStatExample consumeStatExample = new ConsumeStatExample();
        consumeStatExample.createCriteria()
                .andUserIdEqualTo(consumeStat.getUserId())
                .andMonthEqualTo(consumeStat.getMonth())
                .andIsDeleteEqualTo(CommonEnum.NORMAL.getCode());
        List<ConsumeStat> consumeStatList = consumeStatMapper.selectByExample(consumeStatExample);
        if(EmptyUtils.isEmpty(consumeStatList)){
            return null;
        }
        //每用户每月只保留一条数据
        return consumeStatList.get(0);
    }

    @Override
    public List<ConsumeStat> getConsumeStats(ConsumeStat consumeStat) {
        return consumeStatMapper.selectByCondition(consumeStat);
    }

    @Override
    public List<ConsumeStat> getConsumeStatsForm(Long userId, String startMonth, String endMonth) {
        ConsumeStatExample consumeStatExample = new ConsumeStatExample();
        consumeStatExample.createCriteria()
                .andUserIdEqualTo(userId)
                .andMonthGreaterThanOrEqualTo(startMonth)
                .andMonthLessThanOrEqualTo(endMonth)
                .andIsDeleteEqualTo(CommonEnum.NORMAL.getCode());
        return consumeStatMapper.selectByExample(consumeStatExample);
    }

    @Override
    public int countByUserId(Long userId) {
        ConsumeInfoExample consumeInfoExample = new ConsumeInfoExample();
        consumeInfoExample.createCriteria().andUserIdEqualTo(userId);
        return consumeInfoMapper.countByExample(consumeInfoExample);
    }
}
