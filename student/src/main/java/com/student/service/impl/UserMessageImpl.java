package com.student.service.impl;

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
	@Override
	public int insert(UserMessage userMessage) {
		return userMessageMapper.insert(userMessage);
	}
	@Override
	public List<UserMessage> select(String req) {
		UserMessageExample message = g.fromJson(req, UserMessageExample.class);
		
		return userMessageMapper.selectByExample(message);
	}
	@Override
	public void delete(String req) {
		UserMessageExample message = g.fromJson(req, UserMessageExample.class);
		userMessageMapper.deleteByExample(message);
	}
	@Override
	public Long countByExample(UserMessageExample example) {
		return userMessageMapper.countByExample(example);
	}
	@Override
	public List<CityInfo> selectCityInfo(Map<String, String> param) {
		return userMessageMapper.selectCityInfo(param);
	}
	@Override
	public List<CityInfo> selectEmployRate(Map<String, String> param) {
		return userMessageMapper.selectEmployRate(param);
	}
	@Override
	public List<CityInfo> selectTrainAndJob(Map<String, String> param) {
		return userMessageMapper.selectTrainAndJob(param);
	}
	@Override
	public List<CityInfo> selectTopTenJob(Map<String, String> param) {
		return userMessageMapper.selectTopTenJob(param);
	}
	@Override
	public Long countBySelectByMe(Map<String, String> example) {
		return userMessageMapper.countBySelectByMe(example);
	}
	
}
