package com.cf.aries.base.service.impl;

import com.cf.aries.base.dao.UserInfoMapper;
import com.cf.aries.base.service.UserService;
import com.cf.aries.common.po.UserInfo;
import com.cf.aries.common.po.UserInfoExample;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

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

    @Override
    public UserInfo getUserInfoById(Long userId) {
        return userInfoMapper.selectByPrimaryKey(userId);
    }

    @Override
    public int insertUserInfo(UserInfo userInfo) {
        return userInfoMapper.insertSelective(userInfo);
    }

    @Override
    public int updateUserInfo(UserInfo userInfo) {
        return userInfoMapper.updateByPrimaryKeySelective(userInfo);
    }
}
