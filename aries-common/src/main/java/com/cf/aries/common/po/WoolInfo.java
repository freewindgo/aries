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
public class WoolInfo extends PageInfo implements Serializable {
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