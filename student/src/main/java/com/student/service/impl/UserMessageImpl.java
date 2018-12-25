package com.student.service.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.google.gson.Gson;
import com.student.dao.mapper.bo.UserMessage;
import com.student.dao.mapper.bo.UserMessageExample;
import com.student.dao.mapper.interfaces.UserMessageMapper;
import com.student.service.interfaces.IUserMessage;
import com.student.until.CityInfo;

@Service
@Transactional
public class UserMessageImpl implements IUserMessage{

	@Resource
	private UserMessageMapper userMessageMapper;
	private Gson g = new Gson();
	public int insert(UserMessage userMessage) {
		return userMessageMapper.insert(userMessage);
	}
	public List<UserMessage> select(String req) {
		UserMessageExample message = g.fromJson(req, UserMessageExample.class);
		
		return userMessageMapper.selectByExample(message);
	}
	public void delete(String req) {
		UserMessageExample message = g.fromJson(req, UserMessageExample.class);
		userMessageMapper.deleteByExample(message);
	}
	public Long countByExample(UserMessageExample example) {
		return userMessageMapper.countByExample(example);
	}
	public List<CityInfo> selectCityInfo(Map<String, String> param) {
		return userMessageMapper.selectCityInfo(param);
	}
	public List<CityInfo> selectEmployRate(Map<String, String> param) {
		return userMessageMapper.selectEmployRate(param);
	}
	public List<CityInfo> selectTrainAndJob(Map<String, String> param) {
		return userMessageMapper.selectTrainAndJob(param);
	}
	public List<CityInfo> selectTopTenJob(Map<String, String> param) {
		return userMessageMapper.selectTopTenJob(param);
	}
	public Long countBySelectByMe(Map<String, String> example) {
		return userMessageMapper.countBySelectByMe(example);
	}
	public List<UserMessage> selectByPage(int i, int j) {
		Map<String, Integer> map = new HashMap<String, Integer>();
		map.put("low", i);
		map.put("height", j);
		return userMessageMapper.selectByPage(map);
	}
	public List<UserMessage> selectByPageAndUserId(int i, int j, String string) {
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("low", i);
		map.put("height", j);
		map.put("userId", string);
		return userMessageMapper.selectByPageAndUserId(map);
	}
	public List<CityInfo> selectEmployRate2(Map<String, String> param) {
		return userMessageMapper.selectEmployRate2(param);
	}
	
}
