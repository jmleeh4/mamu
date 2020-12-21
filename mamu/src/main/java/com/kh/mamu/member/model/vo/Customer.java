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
	private int customerLevel;
	private String custmerPw;
	private String custmerName;
	private String address;
	private String phoneNum;
	private String email;
	private Date birthday;
	private Date rdate;
	
}
