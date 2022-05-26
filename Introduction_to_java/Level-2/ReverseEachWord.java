/**
 Question:
 Aadil has been provided with a sentence in the form of a string as a function parameter. The task is to implement a function so as to print the sentence such that each word in the sentence is reversed.
Example:
Input Sentence: "Hello, I am Aadil!"
The expected output will print, ",olleH I ma !lidaA".
 */

 
public class Solution {

	public static String reverseEachWord(String str) {
        
		//Your code goes here
         String ans="";
          int currentWordStart=0;
          int i=0;
          for(;i<str.length();i++){
              if(str.charAt(i)==' '){
                  //Reverse Current Word
                  int currentWordEnd=i-1;
                  String reversedWord="";
                  for(int j=currentWordStart;j<=currentWordEnd;j++){
                      reversedWord=str.charAt(j)+reversedWord;
                  }
                  //Add it final String(ans)
                  ans+=reversedWord+" ";
                  currentWordStart=i+1;
              }
          }
          int currentWordEnd=i-1;
          String reversedWord="";
          for(int j=currentWordStart;j<=currentWordEnd;j++){
              reversedWord=str.charAt(j)+reversedWord;
          }
          ans+=reversedWord;
          return ans;
        
        
	}

}