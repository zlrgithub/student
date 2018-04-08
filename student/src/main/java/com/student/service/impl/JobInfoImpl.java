package com.student.service.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.student.dao.mapper.bo.JobInfo;
import com.student.dao.mapper.interfaces.JobInfoMapper;
import com.student.service.interfaces.IJobInfo;
@Service
@Transactional
public class JobInfoImpl implements IJobInfo{
	
	@Resource
	private JobInfoMapper jobInfoMapper;
	@Override
	public List<JobInfo> selectByPage(int low, int hight,String name) {
		Map<String, Object> map = new HashMap<>();
		map.put("low", low);
		map.put("hight", hight);
		map.put("name", name);
		return jobInfoMapper.selectByPage(map);
	}
	@Override
	public List<JobInfo> selectByPageAndJobName(int low, int hight, String name, String jobName) {
		Map<String, Object> map = new HashMap<>();
		map.put("low", low);
		map.put("hight", hight);
		map.put("jobName", jobName);
		map.put("name", name);
		return jobInfoMapper.selectByPageAndJobName(map);
	}
	@Override
	public List<JobInfo> selectBusiInfoByPage(int proview, int next,String now) {
		Map<String, Object> map = new HashMap<>();
		map.put("proview", proview);
		map.put("next", next);
		map.put("now", now);
		return jobInfoMapper.selectBusiInfoByPage(map);
	}
	@Override
	public List<JobInfo> selectJobInfoBypage(String now, Integer low, Integer height) {
		Map<String, Object> map = new HashMap<>();
		map.put("now", now);
		map.put("low", low);
		map.put("height", height);
		
		return jobInfoMapper.selectJobInfoBypage(map);
	}
	
}
