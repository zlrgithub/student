package com.student.service.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.student.dao.mapper.bo.User;
import com.student.dao.mapper.interfaces.UserMapper;
import com.student.dao.mapper.interfaces.businessUserMapper;
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
		param.put("userName",user.getUserName());
		param.put("password",user.getPassword());
		return userMapper.login(param);
	}
	@Override
	public List<User> selectByPage(int i, int j) {
		Map<String,Integer> map = new HashMap<>();
		map.put("low", i);
		map.put("height", j);
		return userMapper.selectByPage(map);
	}
	@Override
	public List<User> selectByPageAndUserId(int i, int j, String string) {
		Map<String,Object> map = new HashMap<>();
		map.put("low", i);
		map.put("height", j);
		map.put("userId", string);
		return userMapper.selectByPageAndUserId(map);
	}
	
}
