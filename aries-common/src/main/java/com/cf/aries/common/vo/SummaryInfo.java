package com.cf.aries.common.vo;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * SummaryInfo
 *
 * @author 于文硕 yuwenshuo@passiontec.cn
 * @since 2018/5/29 10:18
 */
@Getter
@Setter
@ToString
@JsonInclude(JsonInclude.Include.NON_NULL)
public class SummaryInfo {

    private String adviceCard;

    private Integer adviceDay;

    private Integer cardTotal;

    private Integer recordTotal;

}


