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
public class AdminNotice implements Serializable {
    private Long id;

    private String content;

    private String ctime;

    private Byte isDelete;

}