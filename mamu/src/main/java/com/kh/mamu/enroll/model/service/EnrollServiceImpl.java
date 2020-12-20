package com.kh.mamu.enroll.model.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.kh.mamu.enroll.model.dao.EnrollDAO;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Transactional(propagation = Propagation.REQUIRED, 
isolation = Isolation.READ_COMMITTED,
rollbackFor = Exception.class)
@Service
public class EnrollServiceImpl implements EnrollService {
	
	@Autowired
	private EnrollDAO enrollDAO;
	

}
