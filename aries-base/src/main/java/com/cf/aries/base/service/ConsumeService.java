package com.cf.aries.base.service;

import com.cf.aries.common.po.ConsumeInfo;

import java.util.List;

/**
 * ConsumeService
 *
 * @author 于文硕 yuwenshuo@passiontec.cn
 * @since 2018/5/15 16:05
 */
public interface ConsumeService {

    ConsumeInfo getConsumeInfoById(Long consumeId);

    List<ConsumeInfo> getConsumeInfos(ConsumeInfo consumeInfo);

    int getConsumeInfoTotal(ConsumeInfo consumeInfo);

    int insertConsumeInfo(ConsumeInfo consumeInfo);

    int updateConsumeInfo(ConsumeInfo consumeInfo);

}