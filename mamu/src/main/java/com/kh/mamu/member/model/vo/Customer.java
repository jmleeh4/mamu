package com.kh.mamu.member.model.vo;

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
public class Customer {

	private String customerId;
	private String custmerPw;
	private String custmerName;
	private String email;
	private String phoneNum;
	private String address;
	private Date birthday;
	private Date rdate;
	private int customerLevel;
	
}
