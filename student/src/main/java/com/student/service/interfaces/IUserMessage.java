package com.student.service.interfaces;

import java.util.List;

import com.student.dao.mapper.bo.UserMessage;

public interface IUserMessage {
	int insert(UserMessage userMessage);
	List<UserMessage> select(String req);
	void delete(String req);
}
