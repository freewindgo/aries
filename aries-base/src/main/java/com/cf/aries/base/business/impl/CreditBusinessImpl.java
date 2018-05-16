package com.cf.aries.base.business.impl;

import com.cf.aries.base.business.CreditBusiness;
import com.cf.aries.base.dbrouter.annotation.Split;
import com.cf.aries.base.service.CreditService;
import com.cf.aries.common.enums.CommonEnum;
import com.cf.aries.common.message.CreditMessage;
import com.cf.aries.common.po.CreditCard;
import com.cf.aries.common.util.DateUtils;
import com.cf.aries.common.util.EmptyUtils;
import com.cf.aries.common.util.Response;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;
import java.util.List;

/**
 * CreditBusinessImpl
 *
 * @author 于文硕 yuwenshuo@passiontec.cn
 * @since 2018/5/15 14:47
 */

@Slf4j
@Service
public class CreditBusinessImpl implements CreditBusiness {

    @Autowired
    private CreditService creditService;

    @Transactional
    @Override
    public Response saveCreditCard(CreditCard creditCard) {
        if (EmptyUtils.isEmpty(creditCard.getId())) {
            creditCard.setCtime(DateUtils.formatDate(DateUtils.FORMAT_DEFAULT, new Date()));
            creditCard.setUtime(creditCard.getCtime());
            creditCard.setIsDelete(CommonEnum.NORMAL.getCode());
            creditService.insertCreditCard(creditCard);

        } else {
            creditCard.setUtime(DateUtils.formatDate(DateUtils.FORMAT_DEFAULT, new Date()));
            creditService.updateCreditCard(creditCard);
        }

        return Response.success();
    }

    @Override
    public Response getCreditCardById(Long cardId) {
        CreditCard creditCard = creditService.getCreditCardById(cardId);
        if (creditCard == null) {
            return Response.error(CreditMessage.NO_CARD);
        }
        return Response.success(creditCard);
    }

    @Override
    public Response getCreditCards(CreditCard creditCard) {
        List<CreditCard> creditCardList = creditService.getCreditCards(creditCard);
        if (EmptyUtils.isEmpty(creditCardList)) {
            return Response.error(CreditMessage.NO_CARD);
        }
        return Response.success(creditCardList);
    }

    @Transactional
    @Override
    public Response deleteCreditCard(Long cardId) {
        CreditCard creditCard = new CreditCard();
        creditCard.setId(cardId);
        creditCard.setUtime(DateUtils.formatDate(DateUtils.FORMAT_DEFAULT, new Date()));
        creditCard.setIsDelete(CommonEnum.DELETED.getCode());
        creditService.updateCreditCard(creditCard);
        return Response.success();
    }
}
