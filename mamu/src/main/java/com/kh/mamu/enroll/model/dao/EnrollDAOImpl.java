package com.kh.mamu.enroll.model.dao;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class EnrollDAOImpl implements EnrollDAO {

	@Autowired
	private SqlSessionTemplate sqlSession;
	
	
}
