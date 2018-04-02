package com.student.service.interfaces;

import java.util.List;
import java.util.Map;

import com.student.dao.mapper.bo.UserMessage;
import com.student.dao.mapper.bo.UserMessageExample;
import com.student.until.CityInfo;

public interface IUserMessage {
	int insert(UserMessage userMessage);
	List<UserMessage> select(String req);
	void delete(String req);
	Long countByExample(UserMessageExample example);
	
	List<CityInfo> selectCityInfo(Map<String, String> param);
	List<CityInfo> selectEmployRate(Map<String, String> param);
	List<CityInfo> selectTrainAndJob(Map<String, String> param);
	List<CityInfo> selectTopTenJob(Map<String, String> param);
	Long countBySelectByMe(Map<String, String> example);
}
