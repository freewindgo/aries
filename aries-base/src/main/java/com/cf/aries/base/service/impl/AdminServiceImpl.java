package com.cf.aries.base.service.impl;

import com.cf.aries.base.dao.AdminBankMapper;
import com.cf.aries.base.dao.AdminNoticeMapper;
import com.cf.aries.base.service.AdminService;
import com.cf.aries.common.po.AdminBank;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * AdminServiceImpl
 *
 * @author 于文硕
 * @since 2018/5/29 16:36
 */
@Service
public class AdminServiceImpl implements AdminService{
    @Autowired
    private AdminBankMapper adminBankMapper;

    @Autowired
    private AdminNoticeMapper adminNoticeMapper;

    @Override
    public List<AdminBank> getAllBank() {
        return adminBankMapper.selectAll();
    }
}
