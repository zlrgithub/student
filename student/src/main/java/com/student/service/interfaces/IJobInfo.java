package com.student.service.interfaces;

import java.util.List;

import com.student.dao.mapper.bo.JobInfo;

public interface IJobInfo {
	List<JobInfo> selectByPage(int low,int hight,String name);
	List<JobInfo> selectByPageAndJobName(int low,int hight,String name,String jobName);
	List<JobInfo> selectBusiInfoByPage(int proview, int next,String now);
	List<JobInfo> selectJobInfoBypage(String now, Integer low, Integer height);
}
