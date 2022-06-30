/**
Question:
For a given expression in the form of a string, find the minimum number of brackets that can be reversed in order to make the expression balanced. The expression will only contain curly brackets.
If the expression can't be balanced, return -1.
Example:
Expression: {{{{
If we reverse the second and the fourth opening brackets, the whole expression will get balanced. Since we have to reverse two brackets to make the expression balanced, the expected output will be 2.

Expression: {{{
In this example, even if we reverse the last opening bracket, we would be left with the first opening bracket and hence will not be able to make the expression balanced and the output will be -1.
 */
import java.util.*;

public class Solution {

	public static int countBracketReversals(String input) {
		//Your code goes 
        Stack<Character> stack = new Stack<>();
        int i=0;
        while(i < input.length()){
            if(input.charAt(i) == '{')
                stack.push(input.charAt(i));
            else{
                if(stack.isEmpty())
                    stack.push(input.charAt(i));
                else{
					if(stack.peek() == '{')
                        stack.pop();
                    else
                       stack.push(input.charAt(i)); 
                }
            }
                
            
            i++;
        }
        int count = 0;
        if(stack.size()%2 != 0)
            return -1;
        else{
           while(!stack.isEmpty()){
               Character c1 = stack.pop();
               Character c2 = stack.pop();
               if(c1 == c2)
                   count++;
               else
                   count+=2;
           } 
        }
        return count;
        
	}

}