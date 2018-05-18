package com.cf.aries.common.po;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@JsonIgnoreProperties(value={"isDelete"})
public class CreditCard {
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

    private Integer billDay;

    private Integer payDay;

    private Integer billCycle;

    private Integer remindDay;

    private String expireDay;

    private String ctime;

    private String utime;

    private Byte type;

    private Byte isDelete;

}