package com.student.dao.mapper.interfaces;

import com.student.dao.mapper.bo.SchoolInfo;
import com.student.dao.mapper.bo.SchoolInfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SchoolInfoMapper {
    long countByExample(SchoolInfoExample example);

    int deleteByExample(SchoolInfoExample example);

    int insert(SchoolInfo record);

    int insertSelective(SchoolInfo record);

    List<SchoolInfo> selectByExample(SchoolInfoExample example);

    int updateByExampleSelective(@Param("record") SchoolInfo record, @Param("example") SchoolInfoExample example);

    int updateByExample(@Param("record") SchoolInfo record, @Param("example") SchoolInfoExample example);

	List<SchoolInfo> selectSchoolInfo();
}