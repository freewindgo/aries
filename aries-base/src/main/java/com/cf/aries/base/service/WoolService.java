package com.cf.aries.base.service;

import com.cf.aries.common.po.WoolInfo;

import java.util.List;

/**
 * WoolService
 *
 * @author 于文硕
 * @since 2018/5/16 11:35
 */
public interface WoolService {
    
    WoolInfo getWoolInfoById(Long woolId);

    List<WoolInfo> getWoolInfos(WoolInfo woolInfo);

    int getWoolInfoTotal(WoolInfo woolInfo);

    int insertWoolInfo(WoolInfo woolInfo);

    int updateWoolInfo(WoolInfo woolInfo);

    int realDelete(Integer days);
}
