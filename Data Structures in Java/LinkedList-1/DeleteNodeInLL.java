/**
 Question:
 You have been given a linked list of integers. Your task is to write a function that deletes a node from a given position, 'POS'.
 */
/****************************************************************

	Following is the Node class already written for the Linked List

	class LinkedListNode<T> {
    	T data;
    	LinkedListNode<T> next;
    
    	public LinkedListNode(T data) {
        	this.data = data;
    	}
	}

*****************************************************************/

public class Solution {
	public static LinkedListNode<Integer> deleteNode(LinkedListNode<Integer> head, int pos) {
		// Write your code here.
       
        LinkedListNode<Integer> prev = head;
        if(pos == 0){
            if(head == null)
                return head;
            
            head = head.next;
            return head;
        }
        
        int count = 0;
        while(count < pos-1 && prev != null){
            count++;
            prev = prev.next;
        }
        
        if(prev != null){
            if(prev.next != null)
                prev.next = prev.next.next;
            
        }
        
        return head;
        
	}
}
