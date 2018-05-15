package com.cf.aries.common.vo;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UserInfoVO {
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

}