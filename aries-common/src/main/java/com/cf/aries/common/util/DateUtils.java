package com.cf.aries.common.util;

import org.joda.time.DateTime;

import java.util.Date;

/**
 * DateUtils
 *
 * JODA时间工具类
 *
 * @author 于文硕 yuwenshuo@passiontec.cn
 * @since 2018/5/15 10:25
 */
public class DateUtils {

    public static final String FORMAT_DEFAULT="yyyy-MM-dd HH:mm:ss";//默认的年月日时分秒格式
    public static final String FORMAT_FOR_MONTH="yyyy-MM";//月格式化
    public static final String FORMAT_FOR_DAY="yyyy-MM-dd";//天格式
    public static final String FORMAT_FOR_DAWN="yyyy-MM-dd 00:00:00";
    public static final String FORMAT_FOR_DUSK="yyyy-MM-dd 23:59:59";

    /**
     * 按不同类型格式化日期
     * @param type
     * @param date
     * @return
     */
    public static String formatDate(String type, Date date) {
        DateTime dateTime = new DateTime(date);
        return dateTime.toString(type);
    }

}
