package com.cf.aries.base.business;

import com.cf.aries.common.util.Response;
import com.cf.aries.common.dto.CreditCardDTO;

/**
 * CreditBusiness
 *
 * @author 于文硕 yuwenshuo@passiontec.cn
 * @since 2018/5/15 14:43
 */
public interface CreditBusiness {

    Response saveCreditCard(CreditCardDTO creditCardDTO);

    Response getCreditCardById(Long cardId);

    Response getCreditCards(CreditCardDTO creditCardDTO);

    Response deleteCreditCard(Long cardId);

}
