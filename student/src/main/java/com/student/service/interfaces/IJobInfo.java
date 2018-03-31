package com.student.service.interfaces;

import java.util.List;

import com.student.dao.mapper.bo.JobInfo;
import com.student.dao.mapper.interfaces.JobInfoMapper;

public interface IJobInfo {
	List<JobInfo> selectByPage(int low,int hight,String name);
	List<JobInfo> selectByPageAndJobName(int low,int hight,String name,String jobName);
}
