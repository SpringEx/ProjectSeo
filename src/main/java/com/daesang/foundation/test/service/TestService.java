package com.daesang.foundation.test.service;

import java.util.List;

import javax.annotation.Resource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Service;

import com.daesang.foundation.test.bean.Test;
import com.daesang.foundation.test.dao.TestDao;

@Service
public class TestService {

	private static final Logger logger = LoggerFactory.getLogger(TestService.class);
	
	@Resource(name="testDao")
	private TestDao testDao;
	
	public TestService() {
		logger.info("com.daesang.foundation.test.dao.TestService 생성자 " + this );
	}
	
	public int insert(Test test) {
		int isSuccess = testDao.testInsert( test );
		return isSuccess;
	}

	public List<Test> getList() {
		List< Test > list = testDao.testList( );
		return list;
	}

}
