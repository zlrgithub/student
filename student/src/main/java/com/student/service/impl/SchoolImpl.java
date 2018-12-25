package com.student.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.student.dao.mapper.bo.SchoolInfo;
import com.student.dao.mapper.interfaces.SchoolInfoMapper;
import com.student.service.interfaces.ISchool;
@Service
@Transactional
public class SchoolImpl implements ISchool{

	@Resource
	private SchoolInfoMapper infoMapper;
	public void inert(SchoolInfo info) {
		infoMapper.insert(info);
	}
	public List<SchoolInfo> selectSchoolInfo() {
		return infoMapper.selectSchoolInfo();
	}

}
