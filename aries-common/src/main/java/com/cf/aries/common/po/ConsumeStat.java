package com.cf.aries.common.po;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ConsumeStat {
    private Long id;

    private Long userId;

    private Integer bill;

    private Integer wool;

    private String month;

    private String ctime;

    private String utime;

    private Boolean isDelete;

}