/**
 Question:
 Write a recursive function to convert a given string into the number it represents. That is input will be a numeric string that contains only numbers, you need to convert the string into corresponding integer and return the answer.
 */
import java.lang.Math;
public class solution {

	public static int convertStringToInt(String input){
		// Write your code here
		if(input.length() == 1){
            int a = input.charAt(0) - '0';
            return a;
        }
        
        int a = convertStringToInt(input.substring(1));
        int b = input.charAt(0)-'0';
        b =(int)(b * Math.pow(10, input.length()-1)) + a;
        return b;
        
        
	}
}
