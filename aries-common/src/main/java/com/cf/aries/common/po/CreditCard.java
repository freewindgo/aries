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
@JsonIgnoreProperties(value = {"isDelete"})
public class CreditCard implements Serializable {
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