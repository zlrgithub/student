package com.student.dao.mapper.interfaces;

import com.student.dao.mapper.bo.JobInfo;
import com.student.dao.mapper.bo.JobInfoExample;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

public interface JobInfoMapper {
    long countByExample(JobInfoExample example);

    int deleteByExample(JobInfoExample example);

    int deleteByPrimaryKey(String jobId);

    int insert(JobInfo record);

    int insertSelective(JobInfo record);

    List<JobInfo> selectByExample(JobInfoExample example);

    JobInfo selectByPrimaryKey(String jobId);

    int updateByExampleSelective(@Param("record") JobInfo record, @Param("example") JobInfoExample example);

    int updateByExample(@Param("record") JobInfo record, @Param("example") JobInfoExample example);

    int updateByPrimaryKeySelective(JobInfo record);

    int updateByPrimaryKey(JobInfo record);
    
    
    
    List<JobInfo> selectByPage(Map<String, Integer> map);

	List<JobInfo> selectByPageAndJobName(Map<String, Object> map);
}