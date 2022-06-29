/**
Question:
For a given a string expression containing only round brackets or parentheses, check if they are balanced or not. Brackets are said to be balanced if the bracket which opens last, closes first.
Example:
Expression: (()())
Since all the opening brackets have their corresponding closing brackets, we say it is balanced and hence the output will be, 'true'.
You need to return a boolean value indicating whether the expression is balanced or not.
 */
import java.util.*;
public class Solution {

    public static boolean isBalanced(String expression) {
        //Your code goes here
        Stack<Character> stack = new Stack<Character>();
        for(int i=0; i<expression.length(); i++){
            if(expression.charAt(i) == '(')
                stack.push('(');
            else if(expression.charAt(i) == ')'){
                if(stack.isEmpty())
                    return false;
                
                stack.pop();
            }
        }
        
        if(stack.isEmpty())
            return true;
        else
            return false;
    }
}