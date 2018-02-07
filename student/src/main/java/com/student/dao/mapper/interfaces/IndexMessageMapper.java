package com.student.dao.mapper.interfaces;

import com.student.dao.mapper.bo.IndexMessage;
import com.student.dao.mapper.bo.IndexMessageExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface IndexMessageMapper {
    long countByExample(IndexMessageExample example);

    int deleteByExample(IndexMessageExample example);

    int insert(IndexMessage record);

    int insertSelective(IndexMessage record);

    List<IndexMessage> selectByExample(IndexMessageExample example);

    int updateByExampleSelective(@Param("record") IndexMessage record, @Param("example") IndexMessageExample example);

    int updateByExample(@Param("record") IndexMessage record, @Param("example") IndexMessageExample example);
}