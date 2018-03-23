package com.student.dao.mapper.interfaces;

import com.student.dao.mapper.bo.UserMessage;
import com.student.dao.mapper.bo.UserMessageExample;
import com.student.until.CityInfo;
import com.student.until.WorkInfoMap;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

public interface UserMessageMapper {
    long countByExample(UserMessageExample example);

    int deleteByExample(UserMessageExample example);

    int deleteByPrimaryKey(String studentId);

    int insert(UserMessage record);

    int insertSelective(UserMessage record);

    List<UserMessage> selectByExample(UserMessageExample example);

    UserMessage selectByPrimaryKey(String studentId);

    int updateByExampleSelective(@Param("record") UserMessage record, @Param("example") UserMessageExample example);

    int updateByExample(@Param("record") UserMessage record, @Param("example") UserMessageExample example);

    int updateByPrimaryKeySelective(UserMessage record);

    int updateByPrimaryKey(UserMessage record);

	List<CityInfo> selectCityInfo(Map<String, String> param);

	List<CityInfo> selectEmployRate(Map<String, String> param);

	List<CityInfo> selectTrainAndJob(Map<String, String> param);

	List<CityInfo> selectTopTenJob(Map<String, String> param);

	Long countBySelectByMe(Map<String, String> example);
}