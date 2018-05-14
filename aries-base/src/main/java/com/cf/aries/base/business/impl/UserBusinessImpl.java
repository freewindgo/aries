package com.cf.aries.base.business.impl;

import com.cf.aries.base.business.UserBusiness;
import com.cf.aries.base.dbrouter.annotation.Split;
import com.cf.aries.common.po.UserInfo;
import com.cf.aries.common.util.Response;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

/**
 * UserBusinessImpl
 *
 * @author 于文硕 yuwenshuo@passiontec.cn
 * @since 2018/5/11 14:01
 */

@Slf4j
@Service
public class UserBusinessImpl implements UserBusiness{

    @Split
    @Override
    public Response saveUserInfo(UserInfo userInfo) {
        return null;
    }
}
