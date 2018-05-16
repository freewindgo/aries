package com.cf.aries.base.business.impl;

import com.cf.aries.base.business.ConsumeBusiness;
import com.cf.aries.base.service.ConsumeService;
import com.cf.aries.common.enums.CommonEnum;
import com.cf.aries.common.message.ConsumeMessage;
import com.cf.aries.common.message.ResponseMessage;
import com.cf.aries.common.po.ConsumeInfo;
import com.cf.aries.common.util.DateUtils;
import com.cf.aries.common.util.EmptyUtils;
import com.cf.aries.common.util.Response;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * ConsumeBusinessImpl
 *
 * @author 于文硕 yuwenshuo@passiontec.cn
 * @since 2018/5/15 16:13
 */
@Slf4j
@Service
public class ConsumeBusinessImpl implements ConsumeBusiness {

    @Autowired
    private ConsumeService consumeService;

    @Transactional
    @Override
    public Response saveConsumeInfo(ConsumeInfo consumeInfo) {
        if (EmptyUtils.isEmpty(consumeInfo.getId())) {
            consumeInfo.setCtime(DateUtils.formatDate(DateUtils.FORMAT_DEFAULT, new Date()));
            consumeInfo.setUtime(consumeInfo.getCtime());
            consumeInfo.setIsDelete(CommonEnum.NORMAL.getCode());
            consumeService.insertConsumeInfo(consumeInfo);

        } else {
            consumeInfo.setUtime(DateUtils.formatDate(DateUtils.FORMAT_DEFAULT, new Date()));
            consumeService.updateConsumeInfo(consumeInfo);
        }

        return Response.success();
    }

    @Override
    public Response getConsumeInfoById(Long consumeId) {
        ConsumeInfo consumeInfo = consumeService.getConsumeInfoById(consumeId);
        if (consumeInfo == null) {
            return Response.error(ConsumeMessage.NO_INFO);
        }
        return Response.success(consumeInfo);
    }

    @Override
    public Response getConsumeInfos(ConsumeInfo consumeInfo) {
        List<ConsumeInfo> consumeInfoList = consumeService.getConsumeInfos(consumeInfo);
        if (EmptyUtils.isEmpty(consumeInfoList)) {
            return Response.error(ConsumeMessage.NO_INFO);
        }
        int total = 0;
        if (consumeInfo.getStart() != null && consumeInfo.getSize() != null && consumeInfo.getSize() > 0) {
            total = consumeService.getConsumeInfoTotal(consumeInfo);
        }

        if (total != 0) {
            return Response.success(total, consumeInfoList);
        } else {
            return Response.success(consumeInfoList);
        }

    }

    @Transactional
    @Override
    public Response deleteConsumeInfo(Long consumeId) {
        ConsumeInfo consumeInfo = new ConsumeInfo();
        consumeInfo.setId(consumeId);
        consumeInfo.setUtime(DateUtils.formatDate(DateUtils.FORMAT_DEFAULT, new Date()));
        consumeInfo.setIsDelete(CommonEnum.DELETED.getCode());
        consumeService.updateConsumeInfo(consumeInfo);
        return Response.success();
    }
}
