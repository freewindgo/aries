package com.cf.aries.common.po;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@JsonIgnoreProperties(value={"isDelete"})
public class ConsumeStat extends PageInfo{
    private Long id;

    private Long userId;

    private Integer bill;

    private Integer sheep;

    private String month;

    private String ctime;

    private String utime;

    private Byte isDelete;

}