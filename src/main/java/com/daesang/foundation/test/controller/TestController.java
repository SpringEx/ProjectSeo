package com.daesang.foundation.test.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.daesang.foundation.test.bean.Test;
import com.daesang.foundation.test.service.TestService;

@Controller
@RequestMapping(value="/test/")
public class TestController
{
	private static final Logger logger = LoggerFactory.getLogger(TestController.class);
	
	@Autowired
	private TestService testService;

	public TestController( )
	{
		logger.info( "com.daesang.foundation.test.controller.TestController 생성자 " + this );
	}
	
	@RequestMapping( value="testForm.do" , method=RequestMethod.GET )
	public String form( )
	{
		return "test/testForm";
	}
	
	@RequestMapping( value="testSubmit.do" , method=RequestMethod.POST )
	public String submit( Test test )
	{
		int isSuccess = testService.insert(test);
		
		if ( isSuccess == 1 )
		{
			return "test/testSubmit";
		}
		else
		{
			return "global/error";
		}
	}
	
	@RequestMapping( value="testList.do" , method=RequestMethod.GET )
	public ModelAndView list()
	{
		List<Test> list = testService.getList();
		ModelAndView mav = new ModelAndView( "test/testList" );
		mav.addObject( "testList" , list );
		return mav;
	}
}