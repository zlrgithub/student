package com.student.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.google.gson.Gson;
import com.student.dao.mapper.bo.UserMessage;
import com.student.dao.mapper.bo.UserMessageExample;
import com.student.dao.mapper.interfaces.UserMessageMapper;
import com.student.service.interfaces.IUserMessage;

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
	
}
