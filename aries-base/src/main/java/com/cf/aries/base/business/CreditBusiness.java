package com.cf.aries.base.business;

import com.cf.aries.common.po.CreditCard;
import com.cf.aries.common.util.Response;

/**
 * CreditBusiness
 *
 * @author 于文硕 yuwenshuo@passiontec.cn
 * @since 2018/5/15 14:43
 */
public interface CreditBusiness {

    Response saveCreditCard(CreditCard creditCard);

    Response getCreditCardById(Long cardId);

    Response getCreditCards(CreditCard creditCard);

    Response deleteCreditCard(Long cardId);

    Response getCreditAdvice(Long userId);
}
