package com.cf.aries.base.dao;

import com.cf.aries.common.po.CreditCard;
import com.cf.aries.common.po.CreditCardExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface CreditCardMapper {
    int countByExample(CreditCardExample example);

    int deleteByExample(CreditCardExample example);

    int deleteByPrimaryKey(Long id);

    int insert(CreditCard record);

    int insertSelective(CreditCard record);

    List<CreditCard> selectByExample(CreditCardExample example);

    List<CreditCard> selectByCondition(CreditCard creditCard);

    CreditCard selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") CreditCard record, @Param("example") CreditCardExample example);

    int updateByExample(@Param("record") CreditCard record, @Param("example") CreditCardExample example);

    int updateByPrimaryKeySelective(CreditCard record);

    int updateByPrimaryKey(CreditCard record);
}