package com.kh.mamu.member.model.dao;

import com.kh.mamu.member.model.vo.Member;

public interface MemberDAO {

	Member idCheck(String memberId);

	int memberEnroll(Member member);



}
