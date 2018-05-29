package com.cf.aries.common.po;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.io.Serializable;

@Getter
@Setter
@ToString
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(value={"isDelete"})
public class UserInfo implements Serializable {
    private Long id;

    private String openId;

    private Byte sex;

    private String name;

    private String city;

    private String province;

    private String country;

    private String password;

    private Integer point;

    private String device;

    private String system;

    private String image;

    private Byte isPrivate;

    private Byte isDelete;

    private String ctime;

    private String utime;

    /******以下为页面字段******/
    /**
     * 小程序用户登陆code，通过code获取openId
     */
    private String code;
}