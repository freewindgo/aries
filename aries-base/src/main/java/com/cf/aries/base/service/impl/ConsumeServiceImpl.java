package com.cf.aries.base.service.impl;

import com.cf.aries.base.dao.ConsumeInfoMapper;
import com.cf.aries.base.service.ConsumeService;
import com.cf.aries.common.po.ConsumeInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * ConsumeServiceImpl
 *
 * @author 于文硕 yuwenshuo@passiontec.cn
 * @since 2018/5/15 16:06
 */
@Service
public class ConsumeServiceImpl implements ConsumeService{

    @Autowired
    private ConsumeInfoMapper consumeInfoMapper;

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

}
