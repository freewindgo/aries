package com.cf.aries.base.dao;

import com.cf.aries.common.po.ConsumeStat;
import com.cf.aries.common.po.ConsumeStatExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface ConsumeStatMapper {
    int countByExample(ConsumeStatExample example);

    int deleteByExample(ConsumeStatExample example);

    int deleteByPrimaryKey(Long id);

    int insert(ConsumeStat record);

    int insertSelective(ConsumeStat record);

    List<ConsumeStat> selectByExample(ConsumeStatExample example);

    ConsumeStat selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") ConsumeStat record, @Param("example") ConsumeStatExample example);

    int updateByExample(@Param("record") ConsumeStat record, @Param("example") ConsumeStatExample example);

    int updateByPrimaryKeySelective(ConsumeStat record);

    int updateByPrimaryKey(ConsumeStat record);
}