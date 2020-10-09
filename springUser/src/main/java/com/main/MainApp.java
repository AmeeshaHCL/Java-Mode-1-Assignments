package com.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.model.User;
import com.service.UserService;
import com.service.UserServiceImpl;

public class MainApp {

	public static void main(String[] args) {
		ApplicationContext applicationContext= new ClassPathXmlApplicationContext("/com/config/springuser.xml");
		//UserService userservice= new UserServiceImpl();
		UserService userService= (UserService) applicationContext.getBean("userServiceImpl");
		String str= userService.display( "WelcomeToSpring");
		System.out.println(str);
		System.out.println("The End");
		
		/*User user1= (User) applicationContext.getBean("user");
		user1.setUserId(51666542);
		user1.setUserName("Markov");
		user1.setPassword("q3w4e5r6");
		System.out.println(user1.getUserId());
		System.out.println(user1.getUserName());
		System.out.println(user1.getPassword());
		*/

	}

	
}
