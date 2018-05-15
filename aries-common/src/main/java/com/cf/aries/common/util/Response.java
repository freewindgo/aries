package com.cf.aries.common.util;

import com.cf.aries.common.message.ResponseMessage;
import com.cf.aries.common.message.ResponseMessageInterface;
import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

/**
 * Response
 *
 * 交互工具类
 *
 * @author 于文硕 yuwenshuo@passiontec.cn
 * @since 2018/5/11 13:50
 */

@Getter
@Setter
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Response<T> implements Serializable {
    private int code;
    private String message;
    private T data;

    public boolean succeed() {
        return this.getCode() == ResponseMessage.SUCCESS.getCode();
    }

    public boolean failed() {
        return this.getCode() != ResponseMessage.SUCCESS.getCode();
    }

    public Response() {}

    private Response(int code, String msg) {
        this.code = code;
        this.message = msg;
    }

    private Response(ResponseMessageInterface msg) {
        this.code = msg.getCode();
        this.message = msg.getMessage();
    }

    private Response(ResponseMessageInterface msg, T data) {
        this.code = msg.getCode();
        this.message = msg.getMessage();
        this.data = data;
    }

    public static <T> Response<T> success() {
        return new Response(ResponseMessage.SUCCESS);
    }

    public static <T> Response<T> success(T data) {
        return new Response(ResponseMessage.SUCCESS, data);
    }

    public static <T> Response<T> error() {
        return new Response(ResponseMessage.ERROR);
    }

    public static <T> Response<T> error(String msg) {
        return new Response(ResponseMessage.ERROR.getCode(), msg);
    }

    public static <T> Response<T> error(ResponseMessageInterface msg, T data) {
        return new Response(msg, data);
    }

    public static <T> Response<T> error(ResponseMessageInterface msg) {
        return new Response(msg);
    }

    public String toString() {
        return "Response(code=" + this.getCode() + ", message=" + this.getMessage() + ", data=" + this.getData() + ")";
    }


}
