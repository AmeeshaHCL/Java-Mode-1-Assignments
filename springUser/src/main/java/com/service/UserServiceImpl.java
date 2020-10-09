package com.service;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Service;

import com.dao.UserDao;

@Service

public class UserServiceImpl implements UserService
{

	@Override
	public String display(String arg) {
		
	   String returnString ="";
	   if(arg.length()>5)
	   {
	   ApplicationContext applicationContext= new ClassPathXmlApplicationContext("/com/config/daoconfig2.xml");
	   UserDao userDao = (UserDao) applicationContext.getBean("UserDao");
	    returnString = userDao.readByName(arg);
	   }
	   
	
		//
		return returnString;
	}

}
