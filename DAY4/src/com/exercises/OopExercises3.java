/*public class OOPExercises 
 * {     
 * static int a = 555;   
 *   public static void main(String[] args) {        
 *    A1 objA = new A1();         
 *    B1 objB1 = new B1();        
 *     A1 objB2 = new B1();        
 *      C1 objC1 = new C1();       
 *        B1 objC2 = new C1();         
 *        A1 objC3 = new C1();         
 *        objA.display();         
 *        objB1.display();         
 *        objB2.display();         
 *        objC1.display();         
 *        objC2.display();         
 *        objC3.display();   
 *         } } Output: 
public class A { 
    int a = 100; 
    public void display() { 
        System.out.printf("a in A = %d\n", a); 
    } 
} //class A 
public class B extends A { 
    private int a = 123; 
    public void display() { 
        System.out.printf("a in B = %d\n", a); 
    }     
} //class B 
public class C extends B { 
    private int a = 543; 
    public void display() { 
        System.out.printf("a in C = %d\n", a); 
    } 
} //class C 
*/

// the correct code is below and refer to class A1, B1, C1
package com.exercises;

public class OopExercises3 {

	public static void main(String[] args) {
		A1 objA = new A1();         
		     
		B1 objB1 = new B1();        
		      
		B1 objB2 = new A1();        
		     
		C1 objC1 = new C1();       
		         
		C1 objC2 = new B1();         
		        
		C1 objC3 = new A1();         
		         objA.display();         
		         objB1.display();         
		         objB2.display();         
		         objC1.display();         
		         objC2.display();         
		         objC3.display();   
		     

	}

}
