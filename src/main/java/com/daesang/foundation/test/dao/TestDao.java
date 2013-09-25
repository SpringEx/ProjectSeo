// 인코딩 : UTF-8
package com.daesang.foundation.test.dao;

import java.util.List;

import javax.annotation.Resource;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.support.SqlSessionDaoSupport;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.daesang.foundation.test.bean.Test;

@Service
public class TestDao extends SqlSessionDaoSupport
{
	private static final Logger logger = LoggerFactory.getLogger(TestDao.class);
	
	@Autowired 
	public TestDao(SqlSessionFactory sqlSessionFactory)
	{
		logger.info( "com.daesang.foundation.test.dao.TestDao 생성자 " + this );
		this.setSqlSessionFactory(sqlSessionFactory);
	}
	
	public int testInsert( Test data )
	{
		SqlSession session = getSqlSession( );
		int isSuccess = 0;
		try
		{
			isSuccess = session.insert( "com.daesang.foundation.test.mapper.insertTest" , data );
		}catch (Exception e) {
			e.printStackTrace();
		}
		return isSuccess;
	}

	@SuppressWarnings( "unchecked" )
	public List< Test > testList( )
	{
		SqlSession session = getSqlSession( );
		List< Test > list = null;
		try
		{
			list = session.selectList( "com.daesang.foundation.test.mapper.testList" );
		}catch (Exception e) {
			e.printStackTrace();
		}
		return list;
	}
}