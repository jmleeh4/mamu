package com.kh.mamu.member.model.service;

import com.kh.mamu.member.model.vo.Member;

public interface MemberService {

	Member idCheck(String memberId);

	int memberEnroll(Member member);

	
	
	

}
