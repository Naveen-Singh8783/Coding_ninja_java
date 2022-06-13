/**
Question:
You have been given a singly linked list of integers along with an integer 'N'. Write a function to append the last 'N' nodes towards the front of the singly linked list and returns the new head to the list.
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

	public static LinkedListNode<Integer> appendLastNToFirst(LinkedListNode<Integer> head, int n) {
		//Your code goes here
        if(head == null || head.next == null || n == 0)
            return head;
        
        int len = 1;
        LinkedListNode<Integer> tail =  head;
        while(tail.next != null){
            tail = tail.next;
            len++;
        }
        LinkedListNode<Integer> temp =  head;
        int pos = len - n;
        for(int i=1; i<pos; i++)
            temp = temp.next;
        
        LinkedListNode<Integer> newhead = temp.next;
        temp.next = null;
        tail.next = head;
        head = newhead;
        
        return head;
        
        
        
	}

}