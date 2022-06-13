/**
Question:
You have been given a singly linked list of integers where the elements are sorted in ascending order. Write a function that removes the consecutive duplicate values such that the given list only contains unique elements and returns the head to the updated list.
 */
/*

	Following is the Node class already written for the Linked List

	class LinkedListNode<T> {
    	T data;
    	LinkedListNode<T> next;
    
    	public LinkedListNode(T data) {
        	this.data = data;
    	}
	}

*/

public class Solution {

	public static LinkedListNode<Integer> removeDuplicates(LinkedListNode<Integer> head) {
		//Your code goes here
        if(head == null || head.next == null)
            return head;
        
        LinkedListNode<Integer> curr = head;
        
        
        while(curr.next != null){
            if(curr.data.equals(curr.next.data))
                curr.next = curr.next.next;
            else
                curr = curr.next;
            
        }
        
        
        
        
        return head;
	}

}