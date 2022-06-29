/**
Question:
You have been given two stacks that can store integers as the data. Out of the two given stacks, one is populated and the other one is empty. You are required to write a function that reverses the populated stack using the one which is empty.
 */
import java.util.*;

public class Solution {

	public static void reverseStack(Stack<Integer> input, Stack<Integer> extra) {
		//Your code goes here
        if(input.isEmpty())
            return;
        
        Integer temp = input.pop();
        reverseStack(input, extra);
        while(!input.isEmpty())
            extra.push(input.pop());
        
        input.push(temp);
        while(!extra.isEmpty())
            input.push(extra.pop());
        
        return;
	}
}