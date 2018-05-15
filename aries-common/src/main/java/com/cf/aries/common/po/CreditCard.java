package com.cf.aries.common.po;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CreditCard {
    private Long id;

    private String cardNo;

    private String cardName;

    private Byte cardLevel;

    private Integer creditLimit;

    private Integer creditTempLimit;

    private Integer creditOtherLimit;

    private Integer creditTotalLimit;

    private String billDay;

    private String payDay;

    private Byte billCycle;

    private Byte remindDay;

    private String expireDay;

    private String ctime;

    private String utime;

    private Byte isDelete;

}