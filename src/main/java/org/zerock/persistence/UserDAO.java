package org.zerock.persistence;

import java.util.List;

import org.zerock.domain.UserVO;

public interface UserDAO {
	public void create(UserVO vo)throws Exception;
	public UserVO read(String userID)throws Exception;
	public void update(UserVO vo)throws Exception;
	public void delete(String userID)throws Exception;
	public List<UserVO> listAll() throws Exception;
}
