package com.cf.aries.common.util;

import java.util.Collection;
import java.util.Map;

/**
 * EmptyUtils
 *
 * 校验Obj和Collection是否为空
 *
 * @author 于文硕 yuwenshuo@passiontec.cn
 * @since 2018/5/15 11:39
 */
public class EmptyUtils {

    public static boolean isEmpty(Object obj) {
        return obj == null || "".equals(obj);
    }

    public static boolean isEmpty(Collection<?> collection) {
        return collection == null || collection.isEmpty();
    }

    public static boolean isEmpty(Map<?, ?> map) {
        return map == null || map.isEmpty();
    }

    public static boolean isNotEmpty(Object obj) {
        return obj != null && !"".equals(obj);
    }

    public static boolean isNotEmpty(Collection<?> collection) {
        return collection != null && collection.size() > 0;
    }

    public static boolean isNotEmpty(Map<?, ?> map) {
        return map != null && map.size() > 0;
    }


}