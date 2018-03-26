package com.student.service.interfaces;

import java.util.List;

import com.student.dao.mapper.bo.SchoolInfo;
import com.student.dao.mapper.bo.SchoolInfoExample;

public interface ISchool {
	void inert(SchoolInfo schoolInfo);
	List<SchoolInfo> selectSchoolInfo();
}
