package com.kh.mamu.member.model.vo;

import java.io.Serializable;
import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Member implements Serializable{

	private String memberId;
	private String memberPw;
	private String memberName;
	private String email;
	private String phoneNum;
	private String address;
	private Date rdate;
	private int memberLevel;
	
}
