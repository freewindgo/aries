package com.cf.aries.base.dao;

import com.cf.aries.common.po.AdminBank;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface AdminBankMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(AdminBank record);

    int insertSelective(AdminBank record);

    AdminBank selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(AdminBank record);

    int updateByPrimaryKey(AdminBank record);

    List<AdminBank> selectAll();
}