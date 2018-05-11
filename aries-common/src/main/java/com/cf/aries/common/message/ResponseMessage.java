package com.cf.aries.common.message;

import lombok.Getter;

/**
 * ResponseMessage
 *
 * @author 于文硕 yuwenshuo@passiontec.cn
 * @since 2018/5/11 13:54
 */

@Getter
public enum ResponseMessage implements ResponseMessageInterface {

    SUCCESS(200, "操作成功"),
    ERROR(500, "操作失败");

    private int code;
    private String message;

    private ResponseMessage(int code, String message) {
        this.code = code;
        this.message = message;
    }

}
