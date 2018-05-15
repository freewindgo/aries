package com.cf.aries.base.business;

import com.cf.aries.common.util.Response;
import com.cf.aries.common.dto.UserInfoDTO;

/**
 * UserBusiness
 *
 * @author 于文硕 yuwenshuo@passiontec.cn
 * @since 2018/5/11 13:49
 */

public interface UserBusiness {

    Response saveUserInfo(UserInfoDTO userInfoDTO);

    Response getUserInfoById(Long userId);

    Response checkPassword(Long userId, String password);

}
