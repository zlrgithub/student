package com.student.dao.mapper.interfaces;

import com.student.dao.mapper.bo.BusiUserMessage;
import com.student.dao.mapper.bo.BusiUserMessageExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BusiUserMessageMapper {
    long countByExample(BusiUserMessageExample example);

    int deleteByExample(BusiUserMessageExample example);

    int deleteByPrimaryKey(String busiUserId);

    int insert(BusiUserMessage record);

    int insertSelective(BusiUserMessage record);

    List<BusiUserMessage> selectByExample(BusiUserMessageExample example);

    BusiUserMessage selectByPrimaryKey(String busiUserId);

    int updateByExampleSelective(@Param("record") BusiUserMessage record, @Param("example") BusiUserMessageExample example);

    int updateByExample(@Param("record") BusiUserMessage record, @Param("example") BusiUserMessageExample example);

    int updateByPrimaryKeySelective(BusiUserMessage record);

    int updateByPrimaryKey(BusiUserMessage record);
}