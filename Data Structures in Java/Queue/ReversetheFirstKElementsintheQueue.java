/*
Question:
For a given queue containing all integer data, reverse the first K elements.
You have been required to make the desired change in the input queue itself.
 */
import java.util.LinkedList;
import java.util.Queue;

public class Solution {

	public static Queue<Integer> reverseKElements(Queue<Integer> input, int k) {
		//Your code goes here
        if(input.isEmpty())
            return input;
        
      Queue<Integer> q1 = new LinkedList<Integer>();
    	int i=0;
        while(i < k){
            q1.add(input.remove());
         	i++;   
        }
        
        reverseQueue(q1);
        
        Queue<Integer> q2 = new LinkedList<Integer>();
        while(!input.isEmpty())
            q2.add(input.remove());
        
        while(!q1.isEmpty())
            input.add(q1.remove());
        
        while(!q2.isEmpty())
            input.add(q2.remove());
        
        return input;
        
        
	}
    public static void reverseQueue(Queue<Integer> input) {
		//Your code goes here
        if(input.size() <= 1)
            return;
        
        int elem = input.remove();
        reverseQueue(input);
        input.add(elem);
        return;
	}

}