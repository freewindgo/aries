package com.cf.aries.base.business;

import com.cf.aries.common.po.WoolInfo;
import com.cf.aries.common.util.Response;

/**
 * WoolBusiness
 *
 * @author 于文硕
 * @since 2018/5/16 11:40
 */
public interface WoolBusiness {

    Response saveWoolInfo(WoolInfo woolInfo);

    Response getWoolInfoById(Long woolId);

    Response getWoolInfos(WoolInfo woolInfo);

    Response deleteWoolInfo(Long woolId);
}
