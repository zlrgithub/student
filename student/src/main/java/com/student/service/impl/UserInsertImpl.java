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
	
	public int insert(User user) {
		return userMapper.insert(user);
	}
	public List<User> login(User user) {
		Map<String, String> param  = new HashMap<String, String>();
		param.put("userName",user.getUserName());
		param.put("password",user.getPassword());
		return userMapper.login(param);
	}
	public List<User> selectByPage(int i, int j) {
		Map<String,Integer> map = new HashMap<String,Integer>();
		map.put("low", i);
		map.put("height", j);
		return userMapper.selectByPage(map);
	}
	public List<User> selectByPageAndUserId(int i, int j, String string) {
		Map<String,Object> map = new HashMap<String,Object>();
		map.put("low", i);
		map.put("height", j);
		map.put("userId", string);
		return userMapper.selectByPageAndUserId(map);
	}
	
}
