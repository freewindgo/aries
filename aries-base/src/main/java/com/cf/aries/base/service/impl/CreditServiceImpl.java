package com.cf.aries.base.service.impl;

import com.cf.aries.base.dao.CreditCardMapper;
import com.cf.aries.base.service.CreditService;
import com.cf.aries.common.enums.CommonEnum;
import com.cf.aries.common.enums.CreditEnum;
import com.cf.aries.common.po.CreditCard;
import com.cf.aries.common.po.CreditCardExample;
import com.cf.aries.common.util.DateUtils;
import com.cf.aries.common.util.EmptyUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

/**
 * CreditServiceImpl
 *
 * @author 于文硕 yuwenshuo@passiontec.cn
 * @since 2018/5/15 14:14
 */
@Service
public class CreditServiceImpl implements CreditService {

    @Autowired
    private CreditCardMapper creditCardMapper;

    @Override
    public CreditCard getCreditCardById(Long cardId) {
        return creditCardMapper.selectByPrimaryKey(cardId);
    }

    @Override
    public List<CreditCard> getCreditCards(CreditCard condition) {
        return creditCardMapper.selectByCondition(condition);
    }

    @Override
    public int insertCreditCard(CreditCard creditCard) {
        return creditCardMapper.insertSelective(creditCard);
    }

    @Override
    public int updateCreditCard(CreditCard creditCard) {
        return creditCardMapper.updateByPrimaryKeySelective(creditCard);
    }

    @Override
    public int realDelete(Integer days) {
        String dateCondition = DateUtils.calDate(DateUtils.FORMAT_DEFAULT, new Date(), days);
        CreditCardExample creditCardExample = new CreditCardExample();
        creditCardExample.createCriteria()
                .andUtimeLessThan(dateCondition)
                .andIsDeleteEqualTo(CommonEnum.DELETED.getCode());
        return creditCardMapper.deleteByExample(creditCardExample);
    }

    @Override
    public CreditCard getCreditAdvice(Long userId) {
        Integer today = DateUtils.getDayMsg(DateUtils.DAY, new Date());

        List<CreditCard> adviceCreditList = creditCardMapper.selectAdviceCredit(userId, today);
        if(EmptyUtils.isEmpty(adviceCreditList)){
            return null;
        }

        return adviceCreditList.get(0);
    }
}
