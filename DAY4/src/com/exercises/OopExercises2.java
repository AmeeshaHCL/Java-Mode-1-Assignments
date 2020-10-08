/*public class OOPExercises {     public static void main(String[] args) {         FirstClass objA = new FirstClass();         SecondClass objB = new SecondClass();         System.out.println("in main(): ");         System.out.println("objA.a = "+objA.getFirstClass());         System.out.println("objB.b = "+objB.getSecondClass());         objA.setFirstClass (222);         objB.setSecondClass (333.33);         System.out.println("objA.a = "+objA.getFirstClass());         System.out.println("objB.b = "+objB.getSecondClass());     } } Output: 
public class FirstClass { 
 int a = 100;     
 public FirstClass () {        
  System.out.println("in the constructor of class FirstClass: ");         
  System.out.println("a = "+a);        
  a = 333;        
   System.out.println("a = "+a);    
    }     
    public void setFirstClass( int value) 
    {         a = value;     
    }     
    public int getFirstClass() 
    {         return a;     
    }
   } //class FirstClass 
public class SecondClass { 
    double b = 123.45; 
    public SecondClass() { 
        System.out.println("-----in the constructor of class B: "); 
        System.out.println("b = "+b); 
        b = 3.14159; 
        System.out.println("b = "+b); 
    } 
    public void setSecondClass( double value) { 
        b = value; 
    } 
    public double getSecondClass() { 
        return b; 
    } 
} //class SecondClass 
*/
// to correct the above code



package com.exercises;

public class OopExercises2 {
	public static void main(String[] args) {
		FirstClass obj= new FirstClass();
		obj.setFirstClass(100);
		System.out.println("in the constructor of class FirstClass: ");         
		System.out.println("a = "+obj.getFirstClass());
		SecondClass obj2 = new SecondClass();
		obj2.getSecondClass();
		
	}

}
