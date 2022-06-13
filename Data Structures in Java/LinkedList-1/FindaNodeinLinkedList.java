/**
 Question:
 You have been given a singly linked list of integers. Write a function that returns the index/position of integer data denoted by 'N' (if it exists). Return -1 otherwise.
 */
/****************************************************************

	Following is the class structure of the Node class:

	class LinkedListNode<T> {
    	T data;
    	LinkedListNode<T> next;
    
    	public LinkedListNode(T data) {
        	this.data = data;
    	}
	}

*****************************************************************/

public class Solution {
	public static int findNode(LinkedListNode<Integer> head, int n) {
		// Write your code here.
        if(head == null)
            return -1;
        
        LinkedListNode<Integer> curr = head;
        int count = 0;
        while(curr != null && curr.data != n){
            count++;
            curr = curr.next;
        }
        
        if(curr != null)
            return count;
        else
            return -1;
	}
}