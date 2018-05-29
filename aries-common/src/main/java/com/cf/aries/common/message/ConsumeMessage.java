package com.cf.aries.common.message;

import lombok.Getter;

/**
 * CreditMessage
 *
 * @author 于文硕 yuwenshuo@passiontec.cn
 * @since 2018/5/15 13:37
 */

@Getter
public enum ConsumeMessage implements ResponseMessageInterface{
    NO_INFO(502,"未查询到有效数据"),
    ;

    private int code;
    private String message;

    ConsumeMessage(int code, String message) {
        this.code = code;
        this.message = message;
    }
}
