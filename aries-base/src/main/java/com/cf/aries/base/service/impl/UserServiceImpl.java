package com.cf.aries.base.service.impl;

import com.cf.aries.base.dao.UserInfoMapper;
import com.cf.aries.base.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * UserServiceImpl
 *
 * @author 于文硕 yuwenshuo@passiontec.cn
 * @since 2018/5/11 14:01
 */

@Service
public class UserServiceImpl implements UserService{

    @Autowired
    private UserInfoMapper userInfoMapper;



}
