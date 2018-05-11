package com.cf.aries.common.dbrouter.annotation;

import java.lang.annotation.*;

/**
 * Split
 *
 * @author 于文硕 yuwenshuo@passiontec.cn
 * @since 2018/5/11 17:03
 */
@Target({ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface Split {
    String value() default "";
}
