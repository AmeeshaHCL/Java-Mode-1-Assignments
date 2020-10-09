package com.springmvcdemo1.springcoredemo;


import java.util.List;

public class Employee {
	
	private int empNo;
	private String empName;
	private String lastName;
	
	private List<Address> addresses;

	public int getEmpNo() {
		return empNo;
	}

	public void setEmpNo(int empNo) {
		this.empNo = empNo;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public List<Address> getAddresses() {
		return addresses;
	}

	public void setAddresses(List<Address> addresses) {
		this.addresses = addresses;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	//private Address address2;
	
	
	/*public Employee(String lastName) {
		super();
		this.lastName = lastName;
	}*/
	/*public Employee() {
		super();
		System.out.println("Employee constructor");
	}
	
	
	public Employee(int empNo, String empName, String lastName) {
		super();
		System.out.println("3 parameter arguments");
		this.empNo = empNo;
		this.empName = empName;
		this.lastName= lastName;
	}
	
	public Address getAddress2() {
		return address2;
	}


	public void setAddress2(Address address2) {
		this.address2 = address2;
	}


	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	public int getEmpNo() {
		return empNo;
	}
	public void setEmpNo(int empNo) {
		this.empNo = empNo;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}

*/}
