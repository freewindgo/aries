package com.cf.aries.common.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CreditCardDTO {
    private Long id;

    private Long userId;

    private Integer bankId;

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

}