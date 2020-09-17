//Exceptional Handling to display message
package com.LabAssignmentsDay5;

public class ExceptionMessage {
	void ageCheck(String name,int age)throws CustomException{
        if(age < 19)
        {
            throw new CustomException("InvalidAgeRangeException");
        }
        else{
            System.out.println("Player name:"+name);
            System.out.println("Player age:"+age);
        }
    }

}
