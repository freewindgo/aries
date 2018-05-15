package com.cf.aries.common.message;

import lombok.Getter;

/**
 * UserMessage
 *
 * @author 于文硕 yuwenshuo@passiontec.cn
 * @since 2018/5/15 13:37
 */

@Getter
public enum UserMessage implements ResponseMessageInterface{
    NO_USER(502,"无此用户"),
    PASSWORD_INVALID(502, "密码错误"),
    ;

    private int code;
    private String message;

    UserMessage(int code, String message) {
        this.code = code;
        this.message = message;
    }
}
