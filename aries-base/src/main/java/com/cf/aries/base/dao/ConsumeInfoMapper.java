package com.cf.aries.base.dao;

import com.cf.aries.common.po.ConsumeInfo;
import com.cf.aries.common.po.ConsumeInfoExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface ConsumeInfoMapper {
    int countByExample(ConsumeInfoExample example);

    int deleteByExample(ConsumeInfoExample example);

    int deleteByPrimaryKey(Long id);

    int insert(ConsumeInfo record);

    int insertSelective(ConsumeInfo record);

    List<ConsumeInfo> selectByExample(ConsumeInfoExample example);

    List<ConsumeInfo> selectByCondition(ConsumeInfo consumeInfo);

    ConsumeInfo selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") ConsumeInfo record, @Param("example") ConsumeInfoExample example);

    int updateByExample(@Param("record") ConsumeInfo record, @Param("example") ConsumeInfoExample example);

    int updateByPrimaryKeySelective(ConsumeInfo record);

    int updateByPrimaryKey(ConsumeInfo record);

    int countByCondition(ConsumeInfo consumeInfo);
}