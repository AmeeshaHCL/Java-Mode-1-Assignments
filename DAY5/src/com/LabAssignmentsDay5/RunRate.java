//To calculate the runrate using exception Handling
package com.LabAssignmentsDay5;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class RunRate {

	public static void main(String[] args)throws IOException {
		float rr;
        BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
        System.out.println("Enter the total runs scored");
        int trs= Integer.parseInt(br.readLine());
        System.out.println("Enter the total overs faced");
        int tof= Integer.parseInt(br.readLine());
        try{
            rr= (float)trs/(float)tof;
            if(rr == Float.POSITIVE_INFINITY || rr == Float.NEGATIVE_INFINITY)
            {
                throw new ArithmeticException();
            }
            System.out.printf("Current Run Rate: %.2f",rr);
        }
        catch(Exception e){
            System.out.println(e);
        }

	}

}
