//Code for printing the longest Word Length
package com.question1;

public class LongestWordLength {
	static int getLargestWord(String str) 
    { 
    int number = str.length(); 
    int result = 0, currentLength = 0; 
    for (int i = 0; i < number; i++) 
    { 
        // If current character is not found then end of the word is found 
        if (str.charAt(i) != ' ') 
            currentLength++; 
  
        // else if the word is found
        else
        { 
            result = Math.max(result, currentLength); 
            currentLength = 0; 
        } 
    } 
  
    // Max function to return the maximum length as it does not contains the length 
    return Math.max(result, currentLength); 
    } 
}
