package com.cf.aries.common.message;

import lombok.Getter;

/**
 * WoolMessage
 *
 * @author 于文硕
 * @since 2018/5/15 13:37
 */

@Getter
public enum WoolMessage implements ResponseMessageInterface{
    NO_WOOL(502,"未查询到有效记录"),
    ;

    private int code;
    private String message;

    WoolMessage(int code, String message) {
        this.code = code;
        this.message = message;
    }
}
