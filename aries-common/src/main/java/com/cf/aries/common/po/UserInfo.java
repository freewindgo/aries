package com.cf.aries.common.po;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UserInfo {
    private Long id;

    private String openId;

    private Byte sex;

    private String name;

    private String city;

    private String province;

    private String country;

    private String password;

    private Integer point;

    private String image;

    private Byte isPrivate;

    private Byte isDelete;

    private String ctime;

    private String utime;

}