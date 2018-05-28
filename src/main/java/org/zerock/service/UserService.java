package org.zerock.service;

import java.util.List;

import org.zerock.domain.UserVO;

public interface UserService {
	public void regist(UserVO user) throws Exception;
	public UserVO read(String UserID) throws Exception;
	public void modify(UserVO user) throws Exception;
	public void remove(String UserID) throws Exception;
	public List<UserVO> listAll() throws Exception;
}
