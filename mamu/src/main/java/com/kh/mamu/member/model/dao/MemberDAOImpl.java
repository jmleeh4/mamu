package com.kh.mamu.member.model.dao;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.kh.mamu.member.model.vo.Member;

@Repository
public class MemberDAOImpl implements MemberDAO {

	@Autowired
	private SqlSessionTemplate sqlSession;

	@Override
	public Member idCheck(String memberId) {
		return sqlSession.selectOne("member.idCheck",memberId);
	}

	@Override
	public int memberEnroll(Member member) {
		return sqlSession.insert("member.memberEnroll",member);
	}

	
	
	
}
