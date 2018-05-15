package com.cf.aries.common.po;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ConsumeInfo {
    private Long id;

    private Long cardId;

    private String cardName;

    private Integer bankId;

    private String bankName;

    private String payTime;

    private Integer bill;

    private Byte isPay;

    private String month;

    private Byte type;

    private Integer woolCycle;

    private Integer woolRate;

    private String ctime;

    private String utime;

    private Byte isDelete;

}