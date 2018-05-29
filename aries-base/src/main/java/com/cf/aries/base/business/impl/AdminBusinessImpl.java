package com.cf.aries.base.business.impl;

import com.cf.aries.base.business.AdminBusiness;
import com.cf.aries.base.service.AdminService;
import com.cf.aries.common.po.AdminBank;
import com.cf.aries.common.util.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * AdminBusinessImpl
 *
 * @author 于文硕 yuwenshuo@passiontec.cn
 * @since 2018/5/29 16:47
 */
@Service
public class AdminBusinessImpl implements AdminBusiness{
    @Autowired
    private AdminService adminService;

    @Override
    public Response getAllBank() {
        List<AdminBank> bankList = adminService.getAllBank();
        return Response.success(bankList);
    }
}
