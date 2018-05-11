package com.cf.aries.common.dbrouter.interceptor;

import lombok.Getter;

/**
 * TransactionalNode
 *
 * @author 于文硕 yuwenshuo@passiontec.cn
 * @since 2018/5/11 17:43
 */
@Getter
public class TransactionalNode {
    private String method;
    private boolean transactional;

    public TransactionalNode(String method, boolean transactional) {
        this.method = method;
        this.transactional = transactional;
    }
}
