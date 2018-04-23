package com.student.service.interfaces;

import java.util.List;

import com.student.dao.mapper.bo.User;
import com.student.dao.mapper.bo.businessUser;

public interface IBusiUser {

	List<businessUser> selectByPage(int i, int j);

	List<businessUser> selectByPageAndUserId(int i, int j, String string);
	
}
