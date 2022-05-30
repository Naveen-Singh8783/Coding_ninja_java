/**
 Question:
 Given a string S (that can contain multiple words), you need to find the word which has minimum length.
Note : If multiple words are of same length, then answer will be first minimum length word in the string.
Words are seperated by single space only.
 */

 
public class Solution {
	
	public static String minLengthWord(String input){
		
		// Write your code here
        if(input.length() <= 0)
            return "";
        
        int count = Integer.MAX_VALUE;
        String ans = "";
        int i=0;
        int start = 0;
        while(i < input.length()){
            if(input.charAt(i) == ' ' || i == input.length()-1){
                if(count > i-start){
                    count = i-start;
                    int j = start;
                    ans = "";
                    if(i == input.length()-1){
                         while(j <= i){
                        ans += input.charAt(j);
                        j++;
                      }
                        
                    }else{
                         while(j < i){
                        ans += input.charAt(j);
                        j++;
                      }
                        
                    }
                   
                }
                start = i+1;
            }
            i++;
            
        }
        
        return ans;

	}
}
