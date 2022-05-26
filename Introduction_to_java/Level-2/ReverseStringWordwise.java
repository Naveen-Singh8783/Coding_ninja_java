/**
 Question:
 Reverse the given string word wise. That is, the last word in given string should come at 1st place, last second word at 2nd place and so on. Individual words should remain as it is.
 */
public class Solution {
	public static String reverseWordWise(String input) {
		// Write your code here
        String ans = "";
        int last_word = input.length()-1;
        for(int i = input.length()-1; i>=0; i--){
            
            if(input.charAt(i) == ' ' || i == 0){
                int j = 0;
                if(i != 0)
                    j = i+1;
                
                while(j <= last_word){
                    ans = ans+input.charAt(j);
                    j++;
                }
                ans += " ";
                last_word = i-1;
                    
            }
        }
        
        return ans;

	}
}
