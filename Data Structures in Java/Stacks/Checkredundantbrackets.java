/**
Question:
For a given expression in the form of a string, find if there exist any redundant brackets or not. It is given that the expression contains only rounded brackets or parenthesis and the input expression will always be balanced.
A pair of the bracket is said to be redundant when a sub-expression is surrounded by unnecessary or needless brackets.
Example:
Expression: (a+b)+c
Since there are no needless brackets, hence, the output must be 'false'.

Expression: ((a+b))
The expression can be reduced to (a+b). Hence the expression has redundant brackets and the output will be 'true'.
 */
import java.util.*;

public class Solution {

	public static boolean checkRedundantBrackets(String expression) {
		//Your code goes here
        Stack<Character> stack = new Stack<>();
        int count = 0;
        int i = 0;
       while(i<expression.length()){
            if(expression.charAt(i) == '('){
                int z = i;
                
                while(expression.charAt(z) != ')'){
                    stack.push(expression.charAt(z));
                    z++;
                }
                
                i = z-1;
                
            }else if(expression.charAt(i) == ')'){
                
                while(stack.peek() != '('){
                    stack.pop();
                    count++;
                }
                if(count <= 1 )
                    return true;
                else{
                   count = 0;
                    stack.pop();
                }
                    
                
            }
           i++;
        }
        
        return false;
	}
}