package com.student.dao.mapper.interfaces;

import com.student.dao.mapper.bo.ShowMessage;
import com.student.dao.mapper.bo.ShowMessageExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ShowMessageMapper {
    long countByExample(ShowMessageExample example);

    int deleteByExample(ShowMessageExample example);

    int insert(ShowMessage record);

    int insertSelective(ShowMessage record);

    List<ShowMessage> selectByExample(ShowMessageExample example);

    int updateByExampleSelective(@Param("record") ShowMessage record, @Param("example") ShowMessageExample example);

    int updateByExample(@Param("record") ShowMessage record, @Param("example") ShowMessageExample example);
}