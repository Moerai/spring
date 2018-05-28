package org.zerock.persistence;

import java.util.List;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.zerock.domain.UserVO;

public class UserDAOImpl implements UserDAO {
	
	@Inject
	private SqlSession session;
	private static String namespace="mapper.UserMapper";

	@Override
	public void create(UserVO vo) throws Exception {
		// TODO Auto-generated method stub
		session.insert(namespace+".create", vo); 
	}

	@Override
	public UserVO read(String userID) throws Exception {
		// TODO Auto-generated method stub
		return session.selectOne(namespace+".read", userID);
	}

	@Override
	public void update(UserVO vo) throws Exception {
		// TODO Auto-generated method stub
		session.update(namespace+".update", vo);
	}

	@Override
	public void delete(String userID) throws Exception {
		// TODO Auto-generated method stub
		session.delete(namespace+".delete", userID);
	}

	@Override
	public List<UserVO> listAll() throws Exception {
		// TODO Auto-generated method stub
		return session.selectList(namespace+".listAll");
	}
	
}
