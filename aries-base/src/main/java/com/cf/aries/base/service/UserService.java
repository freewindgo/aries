package com.cf.aries.base.service;

import com.cf.aries.common.po.UserInfo;

import java.util.List;

/**
 * UserService
 *
 * @author 于文硕 yuwenshuo@passiontec.cn
 * @since 2018/5/11 13:49
 */
public interface UserService {

    UserInfo getUserInfoById(Long userId);

    long insertUserInfo(UserInfo userInfo);

    int updateUserInfo(UserInfo userInfo);

    UserInfo getUserInfoByOpenId(String openId);

}
