package com.student.service.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.apache.log4j.Logger;
import org.codehaus.jackson.map.ObjectMapper;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.student.dao.mapper.bo.User;
import com.student.dao.mapper.bo.UserExample;
import com.student.dao.mapper.interfaces.UserMapper;
import com.student.service.interfaces.UserInsert;
@Service
@Transactional
public class UserInsertImpl implements UserInsert {
	@Resource
	private UserMapper userMapper;
	@Override
	public int insert(User user) {
		return userMapper.insert(user);
	}
	@Override
	public List<User> login(User user) {
		Map<String, String> param  = new HashMap<>();
		param.put("userName", "AND USER_NAME = \'" + user.getUserName() + "\'" );
		param.put("password", "AND PASSWORD = \'" + user.getPassword() + "\'" );
		return userMapper.userExample(param);
	}
	@Override
	public List<User> selectUserId() {
		return userMapper.selectMaxUserId();
	}
	
}
