package com.student.service.interfaces;

import java.util.List;

import com.student.dao.mapper.bo.User;

public interface UserInsert {
	int insert(User user);
	List<User> login(User user);
}
