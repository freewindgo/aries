package com.cf.aries.common.po;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class WoolInfo extends PageInfo{
    private Long id;

    private Integer bankId;

    private String bankName;

    private Long userId;

    private Long consumeId;

    private String woolName;

    private String woolCondition;

    private String woolContent;

    private Integer woolValue;

    private String expireDay;

    private String ctime;

    private String utime;

    private Byte isDelete;

}