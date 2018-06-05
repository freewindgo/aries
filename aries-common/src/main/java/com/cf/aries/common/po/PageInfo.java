package com.cf.aries.common.po;

import lombok.Getter;
import lombok.Setter;

/**
 * PageInfo
 *
 * @author 于文硕 yuwenshuo@passiontec.cn
 * @since 2018/5/15 17:33
 */
@Getter
@Setter
public class PageInfo {

    /**
     * 页码
     */
    Integer start;

    /**
     * 每页显示数据
     */
    Integer size;

    /**
     * 查询值
     */
    String searchValue;
}
