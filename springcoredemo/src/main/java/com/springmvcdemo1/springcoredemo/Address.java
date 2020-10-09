package com.springmvcdemo1.springcoredemo;

//import org.springframework.beans.factory.DisposableBean;
//import org.springframework.beans.factory.InitializingBean;

public class Address{ //implements InitializingBean, DisposableBean{
	private int doorNo;
	private String city;
	private String state;
	
	public Address() {
		super();
		System.out.println(" No parameter Address constructor");
	}
	public Address(int doorNo, String city, String state) {
		super();
		System.out.println("Three parameters");
		this.doorNo = doorNo;
		this.city = city;
		this.state = state;
	}
	
	
	
	
	public int getDoorNo() {
		return doorNo;
	}
	public void setDoorNo(int doorNo) {
		this.doorNo = doorNo;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	
	/*public void add(){
		System.out.println("Init( ) in add ");
		
		
		
	}
	
	public void sub() {
		System.out.println("Destory in sub");
		
	}*/
	/*@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("Init( ) ");
		
		
		
	}
	@Override
	public void destroy() throws Exception {
		System.out.println("Destory");
		
	}*/
	

}
