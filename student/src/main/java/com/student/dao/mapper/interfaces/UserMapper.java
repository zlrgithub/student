package com.student.dao.mapper.interfaces;

import com.student.dao.mapper.bo.User;
import com.student.dao.mapper.bo.UserExample;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

public interface UserMapper {
    long countByExample(UserExample example);

    int deleteByExample(UserExample example);

    int deleteByPrimaryKey(String userId);

    int insert(User record);

    int insertSelective(User record);

    List<User> selectByExample(UserExample example);

    User selectByPrimaryKey(String userId);

    int updateByExampleSelective(@Param("record") User record, @Param("example") UserExample example);

    int updateByExample(@Param("record") User record, @Param("example") UserExample example);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);

	List<User> login(Map<String, String> param);

	List<User> selectByPage(Map<String, Integer> map);

	List<User> selectByPageAndUserId(Map<String, Object> map);
}