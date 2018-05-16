package com.cf.aries.common.po;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(value={"isDelete"})
public class ConsumeInfo extends PageInfo {
    private Long id;

    private Long cardId;

    private String cardName;

    private Long userId;

    private Integer bankId;

    private String payTime;

    private Integer bill;

    private Byte isPay;

    private String month;

    private Byte type;

    private Integer sheepCycle;

    private Integer sheepRate;

    private String ctime;

    private String utime;

    private Byte isDelete;


}