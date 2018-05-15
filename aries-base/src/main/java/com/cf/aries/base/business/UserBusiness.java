package com.cf.aries.base.business;

import com.cf.aries.common.po.UserInfo;
import com.cf.aries.common.util.Response;

/**
 * UserBusiness
 *
 * @author 于文硕 yuwenshuo@passiontec.cn
 * @since 2018/5/11 13:49
 */

public interface UserBusiness {

    Response saveUserInfo(UserInfo userInfo);

    Response getUserInfoById(Long userId);

    Response checkPassword(Long userId, String password);

}
