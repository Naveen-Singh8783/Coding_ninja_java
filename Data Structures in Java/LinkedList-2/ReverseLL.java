/**
Question:
Given a singly linked list of integers, reverse it using recursion and return the head to the modified list. You have to do this in O(N) time complexity where N is the size of the linked list.
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

	public static LinkedListNode<Integer> reverseLinkedListRec(LinkedListNode<Integer> head) {
		//Your code goes here
        if(head == null || head.next == null)
            return head;
        
        
     
        LinkedListNode<Integer> curr = reverseLinkedListRec(head.next);
        LinkedListNode<Integer> prev = curr;
        
        while(prev.next != null){
           prev = prev.next;
        }
        
        prev.next = head;
        head.next = null;
        head = curr;
        
        
        
        return head;
	}

}