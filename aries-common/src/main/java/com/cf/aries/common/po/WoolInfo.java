package com.cf.aries.common.po;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class WoolInfo {
    private Long id;

    private Integer bankId;

    private String bankName;

    private String woolName;

    private String woolCondition;

    private String woolContent;

    private Long userId;

    private String expireDay;

    private String ctime;

    private String utime;

    private Boolean isDelete;

}