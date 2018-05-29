package com.cf.aries.base.service;

import com.cf.aries.common.po.CreditCard;

import java.util.List;

/**
 * CreditService
 *
 * @author 于文硕 yuwenshuo@passiontec.cn
 * @since 2018/5/15 13:56
 */
public interface CreditService {

    CreditCard getCreditCardById(Long cardId);

    List<CreditCard> getCreditCards(CreditCard condition);

    int insertCreditCard(CreditCard creditCard);

    int updateCreditCard(CreditCard creditCard);

    int realDelete(Integer days);

    CreditCard getCreditAdvice(Long userId);

    int countByUserId(Long userId);
}
