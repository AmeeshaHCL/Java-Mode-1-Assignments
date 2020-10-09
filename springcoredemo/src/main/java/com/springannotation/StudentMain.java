package com.springannotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class StudentMain {

	public static void main(String[] args) {
		ApplicationContext applicationContext = new AnnotationConfigApplicationContext("com.springannotation");
		
		Student obj = (Student)applicationContext.getBean("student");
		System.out.println(obj.getStudentId());
		System.out.println(obj.getStudentName());
	}

}
