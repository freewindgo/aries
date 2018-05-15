package com.cf.aries.base.service.impl;

import com.cf.aries.base.dao.CreditCardMapper;
import com.cf.aries.base.service.CreditService;
import com.cf.aries.common.po.CreditCard;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * CreditServiceImpl
 *
 * @author 于文硕 yuwenshuo@passiontec.cn
 * @since 2018/5/15 14:14
 */
@Service
public class CreditServiceImpl implements CreditService{

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
    public int deleteCreditCardById(CreditCard creditCard) {
        return creditCardMapper.updateByPrimaryKeySelective(creditCard);
    }
}
