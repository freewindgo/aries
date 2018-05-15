package com.cf.aries.base.business;

import com.cf.aries.common.po.UserInfo;
import com.cf.aries.common.util.Response;
import com.cf.aries.common.vo.UserInfoVO;

/**
 * UserBusiness
 *
 * @author 于文硕 yuwenshuo@passiontec.cn
 * @since 2018/5/11 13:49
 */

public interface UserBusiness {

    Response saveUserInfo(UserInfoVO userInfoVO);

    Response getUserInfoById(Long userId);

    Response checkPassword(Long userId, String password);

}
