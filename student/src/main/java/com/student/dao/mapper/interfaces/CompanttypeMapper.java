package com.student.dao.mapper.interfaces;

import com.student.dao.mapper.bo.Companttype;
import com.student.dao.mapper.bo.CompanttypeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CompanttypeMapper {
    long countByExample(CompanttypeExample example);

    int deleteByExample(CompanttypeExample example);

    int deleteByPrimaryKey(Integer companyType);

    int insert(Companttype record);

    int insertSelective(Companttype record);

    List<Companttype> selectByExample(CompanttypeExample example);

    Companttype selectByPrimaryKey(Integer companyType);

    int updateByExampleSelective(@Param("record") Companttype record, @Param("example") CompanttypeExample example);

    int updateByExample(@Param("record") Companttype record, @Param("example") CompanttypeExample example);

    int updateByPrimaryKeySelective(Companttype record);

    int updateByPrimaryKey(Companttype record);
}