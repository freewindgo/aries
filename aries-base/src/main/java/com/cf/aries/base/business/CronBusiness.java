package com.cf.aries.base.business;

import com.cf.aries.common.util.Response;

/**
 * CronBusiness
 *
 * @author 于文硕
 * @since 2018/5/16 15:00
 */
public interface CronBusiness {

    void deleteExpireData(Integer days);

    void saveStatInfo(String month, String utime);
}
