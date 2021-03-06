package com.kh.mamu.member.model.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.kh.mamu.member.model.dao.MemberDAO;
import com.kh.mamu.member.model.vo.Member;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Transactional(propagation = Propagation.REQUIRED, 
isolation = Isolation.READ_COMMITTED,
rollbackFor = Exception.class)
@Service
public class MemberServiceImpl implements MemberService {
	
	@Autowired
	private MemberDAO memberDAO;

	@Override
	public Member idCheck(String memberId) {
		return memberDAO.idCheck(memberId);
	}

	@Override
	public int memberEnroll(Member member) {
		return memberDAO.memberEnroll(member);
	}



}
