package com.student.dao.mapper.interfaces;

import com.student.dao.mapper.bo.businessUser;
import com.student.dao.mapper.bo.businessUserExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface businessUserMapper {
    long countByExample(businessUserExample example);

    int deleteByExample(businessUserExample example);

    int deleteByPrimaryKey(String userId);

    int insert(businessUser record);

    int insertSelective(businessUser record);

    List<businessUser> selectByExample(businessUserExample example);

    businessUser selectByPrimaryKey(String userId);

    int updateByExampleSelective(@Param("record") businessUser record, @Param("example") businessUserExample example);

    int updateByExample(@Param("record") businessUser record, @Param("example") businessUserExample example);

    int updateByPrimaryKeySelective(businessUser record);

    int updateByPrimaryKey(businessUser record);
}