package com.student.service.interfaces;

import java.util.List;

import com.student.dao.mapper.bo.BusiUserMessage;

public interface IBusiMsg {

	List<BusiUserMessage> selectByPage(int i, int j);

	List<BusiUserMessage> selectByPageAndUserId(int i, int j, String string);

}
