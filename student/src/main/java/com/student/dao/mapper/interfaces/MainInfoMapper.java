package com.student.dao.mapper.interfaces;

import com.student.dao.mapper.bo.MainInfo;
import com.student.dao.mapper.bo.MainInfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MainInfoMapper {
    long countByExample(MainInfoExample example);

    int deleteByExample(MainInfoExample example);

    int insert(MainInfo record);

    int insertSelective(MainInfo record);

    List<MainInfo> selectByExample(MainInfoExample example);

    int updateByExampleSelective(@Param("record") MainInfo record, @Param("example") MainInfoExample example);

    int updateByExample(@Param("record") MainInfo record, @Param("example") MainInfoExample example);
}