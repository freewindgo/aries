package com.cf.aries.base.service.impl;

import com.cf.aries.base.dao.WoolInfoMapper;
import com.cf.aries.base.service.WoolService;
import com.cf.aries.common.po.WoolInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * WoolServiceImpl
 *
 * @author 于文硕 yuwenshuo@passiontec.cn
 * @since 2018/5/16 11:36
 */

@Service
public class WoolServiceImpl implements WoolService{

    @Autowired
    private WoolInfoMapper woolInfoMapper;

    @Override
    public WoolInfo getWoolInfoById(Long woolId) {
        return woolInfoMapper.selectByPrimaryKey(woolId);
    }

    @Override
    public List<WoolInfo> getWoolInfos(WoolInfo woolInfo) {
        return woolInfoMapper.selectByCondition(woolInfo);
    }

    @Override
    public int getWoolInfoTotal(WoolInfo woolInfo) {
        return woolInfoMapper.countByCondition(woolInfo);
    }

    @Override
    public int insertWoolInfo(WoolInfo woolInfo) {
        return woolInfoMapper.insertSelective(woolInfo);
    }

    @Override
    public int updateWoolInfo(WoolInfo woolInfo) {
        return woolInfoMapper.updateByPrimaryKeySelective(woolInfo);
    }
}
