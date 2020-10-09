package com.springmvcdemo1.springcoredemo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
//singleton
{
    public static void main( String[] args )
    {
    	ApplicationContext context;
    	Address addressOne;
    	Address addressTwo;
    	List<Address> myList;
    	
    
    	try
    	{
    	 context = new ClassPathXmlApplicationContext("/com/springmvcdemo1/springcoredemo/Spring-config.xml");
    	
    	
    	
    	Employee employee= (Employee) context.getBean("employee1");
    	
    	employee.setEmpNo(123);
    	employee.setEmpName("Ameesha");
    	employee.setLastName("Saxena");
    	
    	
    	addressOne = (Address)context.getBean("address1"); // IOC
    	addressOne.setDoorNo(400);
    	addressOne.setCity("Chennai");
    	addressOne.setState("TN");
    	
    	addressOne = new Address(500, "Lucknow", "Uttar Pradesh");
        addressTwo = new Address(100, "Banglore", "KA");
        
        myList = new ArrayList();
    	myList.add(addressOne);
    	myList.add(addressTwo);
    	

    	employee.setAddresses(myList);
    	
    	System.out.println(employee.getEmpNo());
    	System.out.println(employee.getEmpName());
    	System.out.println(employee. getLastName());
    	
    	
    	List<Address> list= employee.getAddresses();
    	//iterate
    	for(Address address : list)
    	{
    		System.out.println(address.getDoorNo());
    		System.out.println(address.getCity());
    		System.out.println(address.getState());
    		}
    	}
    	finally {
    		
    		context = null;
    		addressOne= null;
    		addressTwo= null;
    		myList= null;
    	}
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	//System.out.println(obj.getAddress2().getDoorNo());
    	//System.out.println(obj.getAddress2().getCity());
        /*Employee employee=(Employee) context.getBean("employee1");
        employee.setEmpNo(22);
        employee.setEmpName("Welcome to Spring");
        System.out.println(employee.getEmpNo());
        System.out.println(employee.getEmpName());
        */
        /*Employee var= (Employee) context.getBean("employee2");
        var.setEmpNo(30);
        System.out.println(var.getEmpNo());
        System.out.println("End of Program");
        */
        
        /*address.setDoorNo(219);
        address.setCity("Bangalore");
        address.setState("Karnataka");*/
    	/*Address addressObj =(Address) context.getBean("address1");
        System.out.println("Door Number : " + addressObj.getDoorNo());
        System.out.println("City        : " + addressObj.getCity());
        System.out.println("State     : " + addressObj.getState());
        ((AbstractApplicationContext)context).registerShutdownHook();*/
    }
}
