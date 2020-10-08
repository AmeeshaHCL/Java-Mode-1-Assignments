/*public class OopExercises {
	   public static void main(String[] args) {        
		   
		   A objA = new A();         
		   System.out.println("in main(): ");        
		   System.out.println("objA.a = "+objA.a);         
		   objA.a = 222;     } } 
	public class A { 
	    private int a = 100; 
	    public void setA( int value) { 
	        a = value; 
	} 
	    public int getA() { 
	        return a; 
	    } 
	} //class A 
	

}
*/
//to correct this code refer to class A and OopExercises


package com.exercises;

public class OopExercises {

	public static void main(String[] args) 
	{
		A objA = new A();         
		   
		   System.out.println("in main(): "); 
		   System.out.println("objA.a = "+objA.getA());         
		   objA.setA(222);    
		   
		   
		   
		

	

	}
}
