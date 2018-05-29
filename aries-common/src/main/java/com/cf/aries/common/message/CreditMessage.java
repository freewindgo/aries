package com.cf.aries.common.message;

import lombok.Getter;

/**
 * CreditMessage
 *
 * @author 于文硕 yuwenshuo@passiontec.cn
 * @since 2018/5/15 13:37
 */

@Getter
public enum CreditMessage implements ResponseMessageInterface{
    NO_CARD(502,"未查询到有效卡片"),
    ;

    private int code;
    private String message;

    CreditMessage(int code, String message) {
        this.code = code;
        this.message = message;
    }
}
