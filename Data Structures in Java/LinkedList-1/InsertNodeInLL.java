/**
Question:
You have been given a singly linked list of integers, an integer value called 'data' and a position with the name 'pos.'
 Write a function to add a node to the list with the 'data' at the specified position, 'pos.'
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

	public static LinkedListNode<Integer> insert(LinkedListNode<Integer> head, int pos, int data){
		//Your code goes here
        LinkedListNode<Integer> curr = new LinkedListNode<Integer>(data);
        if(pos == 0){
            curr.next = head;
            head = curr;
            return head;
        }
        
        LinkedListNode<Integer> prev = head;
        for(int i=1; i<pos;i++){
            if(prev.next != null)
             prev = prev.next;
            else
                return head;
        }
           
        
        LinkedListNode<Integer> temp = prev.next;
        prev.next = curr;
        curr.next = temp;
        
        return head;
	}
}