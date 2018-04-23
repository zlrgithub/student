package com.student.service.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.student.dao.mapper.bo.BusiUserMessage;
import com.student.dao.mapper.interfaces.BusiUserMessageMapper;
import com.student.service.interfaces.IBusiMsg;

@Service
@Transactional
public class BusiMsgImpl implements IBusiMsg{

	@Resource
	BusiUserMessageMapper busiUserMessageMapper;
	
	@Override
	public List<BusiUserMessage> selectByPage(int i, int j) {
		Map<String,Integer> map = new HashMap<>();
		map.put("low", i);
		map.put("height", j);
		return busiUserMessageMapper.selectByPage(map);
	}

	@Override
	public List<BusiUserMessage> selectByPageAndUserId(int i, int j, String string) {
		Map<String,Object> map = new HashMap<>();
		map.put("low", i);
		map.put("height", j);
		map.put("userId", string);
		return busiUserMessageMapper.selectByPageAndUserId(map);
	}

}
