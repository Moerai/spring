package org.zerock.service;

import java.util.List;

import javax.inject.Inject;

import org.zerock.domain.UserVO;
import org.zerock.persistence.UserDAO;

public class UserServiceImpl implements UserService{

	@Inject
	UserDAO dao;
	
	@Override
	public void regist(UserVO user) throws Exception {
		// TODO Auto-generated method stub
		dao.create(user);
		System.out.println("생성완료");
	}

	@Override
	public UserVO read(String UserID) throws Exception {
		// TODO Auto-generated method stub
		return dao.read(UserID);
	}

	@Override
	public void modify(UserVO user) throws Exception {
		// TODO Auto-generated method stub
		dao.update(user);
		System.out.println("service modify"+user.getUserID());
	}

	@Override
	public void remove(String UserID) throws Exception {
		// TODO Auto-generated method stub
		dao.delete(UserID);
		System.out.println("Service delete"+UserID);
	}

	@Override
	public List<UserVO> listAll() throws Exception {
		// TODO Auto-generated method stub
		return dao.listAll();
	}
	
}
