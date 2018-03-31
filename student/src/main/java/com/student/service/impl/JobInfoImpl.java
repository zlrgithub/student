package com.student.service.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.student.dao.mapper.bo.JobInfo;
import com.student.dao.mapper.interfaces.JobInfoMapper;
import com.student.dao.mapper.interfaces.SchoolInfoMapper;
import com.student.service.interfaces.IJobInfo;
@Service
@Transactional
public class JobInfoImpl implements IJobInfo{
	
	@Resource
	private JobInfoMapper jobInfoMapper;
	@Override
	public List<JobInfo> selectByPage(int low, int hight) {
		Map<String, Integer> map = new HashMap<>();
		map.put("low", low);
		map.put("hight", hight);
		return jobInfoMapper.selectByPage(map);
	}
	@Override
	public List<JobInfo> selectByPageAndJobName(int low, int hight, String jobName) {
		Map<String, Object> map = new HashMap<>();
		map.put("low", low);
		map.put("hight", hight);
		map.put("jobName", jobName);
		return jobInfoMapper.selectByPageAndJobName(map);
	}
	
}
