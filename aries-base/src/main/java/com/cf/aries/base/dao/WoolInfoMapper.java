package com.cf.aries.base.dao;

import com.cf.aries.common.po.WoolInfo;
import com.cf.aries.common.po.WoolInfoExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface WoolInfoMapper {
    int countByExample(WoolInfoExample example);

    int deleteByExample(WoolInfoExample example);

    int deleteByPrimaryKey(Long id);

    int insert(WoolInfo record);

    int insertSelective(WoolInfo record);

    List<WoolInfo> selectByExample(WoolInfoExample example);

    WoolInfo selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") WoolInfo record, @Param("example") WoolInfoExample example);

    int updateByExample(@Param("record") WoolInfo record, @Param("example") WoolInfoExample example);

    int updateByPrimaryKeySelective(WoolInfo record);

    int updateByPrimaryKey(WoolInfo record);
}