// program to calculate the sum using the calculator

package com.labAssignments;

public class Calculator {
	public int num1;
	public int num2;
	
	public int add(int num1, int num2)
	{
		return num1+num2;
	}
	
	//POJO file default constructors
	public Calculator() {
		super();
		
	}
	//getter and setter methods
	public int getNum1() {
		return num1;
	}
	public void setNum1(int num1) {
		this.num1 = num1;
	}
	public int getNum2() {
		return num2;
	}
	public void setNum2(int num2) {
		this.num2 = num2;
	}
	
	
	

}
