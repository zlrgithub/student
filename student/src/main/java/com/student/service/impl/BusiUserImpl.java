package com.student.service.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.student.dao.mapper.bo.User;
import com.student.dao.mapper.bo.businessUser;
import com.student.dao.mapper.interfaces.businessUserMapper;
import com.student.service.interfaces.IBusiUser;

@Service
@Transactional
public class BusiUserImpl implements IBusiUser{
	@Resource
	businessUserMapper businessUserMapper;
	
	@Override
	public List<businessUser> selectByPage(int i, int j) {
		Map<String,Integer> map = new HashMap<>();
		map.put("low", i);
		map.put("height", j);
		return businessUserMapper.selectByPage(map);
	}
	@Override
	public List<businessUser> selectByPageAndUserId(int i, int j, String string) {
		Map<String,Object> map = new HashMap<>();
		map.put("low", i);
		map.put("height", j);
		map.put("userId", string);
		return businessUserMapper.selectByPageAndUserId(map);
	}
}
