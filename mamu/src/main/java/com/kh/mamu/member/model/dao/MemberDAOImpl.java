package com.kh.mamu.member.model.dao;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.kh.mamu.member.model.vo.Customer;

@Repository
public class MemberDAOImpl implements MemberDAO {

	@Autowired
	private SqlSessionTemplate sqlSession;

	@Override
	public Customer idCheck(String customerId) {
		return sqlSession.selectOne("member.idCheck",customerId);
	}

	
	
	
}
