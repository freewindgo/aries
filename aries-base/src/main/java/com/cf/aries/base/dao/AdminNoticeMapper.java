package com.cf.aries.base.dao;

import com.cf.aries.common.po.AdminNotice;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface AdminNoticeMapper {
    int deleteByPrimaryKey(Long id);

    int insert(AdminNotice record);

    int insertSelective(AdminNotice record);

    AdminNotice selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(AdminNotice record);

    int updateByPrimaryKey(AdminNotice record);
}