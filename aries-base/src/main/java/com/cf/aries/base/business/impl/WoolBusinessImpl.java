package com.cf.aries.base.business.impl;

import com.cf.aries.base.business.WoolBusiness;
import com.cf.aries.base.service.WoolService;
import com.cf.aries.common.enums.CommonEnum;
import com.cf.aries.common.message.WoolMessage;
import com.cf.aries.common.po.WoolInfo;
import com.cf.aries.common.util.DateUtils;
import com.cf.aries.common.util.EmptyUtils;
import com.cf.aries.common.util.Response;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;
import java.util.List;

/**
 * WoolBusinessImpl
 *
 * @author 于文硕
 * @since 2018/5/16 11:41
 */
@Slf4j
@Service
public class WoolBusinessImpl implements WoolBusiness{
    
    @Autowired
    private WoolService woolService;

    @Transactional
    @Override
    public Response saveWoolInfo(WoolInfo woolInfo) {
        if (EmptyUtils.isEmpty(woolInfo.getId())) {
            woolInfo.setCtime(DateUtils.formatDate(DateUtils.FORMAT_DEFAULT, new Date()));
            woolInfo.setUtime(woolInfo.getCtime());
            woolInfo.setIsDelete(CommonEnum.NORMAL.getCode());
            woolService.insertWoolInfo(woolInfo);

        } else {
            woolInfo.setUtime(DateUtils.formatDate(DateUtils.FORMAT_DEFAULT, new Date()));
            woolService.updateWoolInfo(woolInfo);
        }

        return Response.success();
    }

    @Override
    public Response getWoolInfoById(Long woolId) {
        WoolInfo woolInfo = woolService.getWoolInfoById(woolId);
        if (woolInfo == null) {
            return Response.error(WoolMessage.NO_WOOL);
        }
        return Response.success(woolInfo);
    }

    @Override
    public Response getWoolInfos(WoolInfo woolInfo) {
        List<WoolInfo> woolInfoList = woolService.getWoolInfos(woolInfo);
        if (EmptyUtils.isEmpty(woolInfoList)) {
            return Response.error(WoolMessage.NO_WOOL);
        }
        int total = 0;
        if (woolInfo.getStart() != null && woolInfo.getSize() != null && woolInfo.getSize() > 0) {
            total = woolService.getWoolInfoTotal(woolInfo);
        }

        if (total != 0) {
            return Response.success(total, woolInfoList);
        } else {
            return Response.success(woolInfoList);
        }
    }

    @Transactional
    @Override
    public Response deleteWoolInfo(Long woolId) {
        WoolInfo woolInfo = new WoolInfo();
        woolInfo.setId(woolId);
        woolInfo.setUtime(DateUtils.formatDate(DateUtils.FORMAT_DEFAULT, new Date()));
        woolInfo.setIsDelete(CommonEnum.DELETED.getCode());
        woolService.updateWoolInfo(woolInfo);
        return Response.success();
    }
}
