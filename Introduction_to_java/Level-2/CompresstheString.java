/**
 Question:
 Write a program to do basic string compression. For a character which is consecutively repeated more than once, replace consecutive duplicate occurrences with the count of repetitions.
Example:
If a string has 'x' repeated 5 times, replace this "xxxxx" with "x5".

The string is compressed only when the repeated character count is more than 1.
 */
public class Solution {
	public static String getCompressedString(String str) {
		// Write your code here.
        if(str.length() < 0)
            return "";
        
        int count = 1;
        String ans = "";
        char ch = str.charAt(0);
        
      	for(int i=1; i<str.length(); i++){
            if(ch == str.charAt(i))
                count++;
            else{
                if(count > 1){
                    ans = ans + ch + count;
                    count = 1;
                    ch = str.charAt(i);
                    
                }     
                else
                {
					ans = ans + ch;
                    count = 1;
                    ch = str.charAt(i);
                }
            }
            
        }
        
         		if(count > 1)
                    ans = ans + ch + count;     
                else
					ans = ans + ch;
        
        
        return ans;
	}

}