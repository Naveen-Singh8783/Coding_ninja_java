/**
Question:
You have been given a head to a singly linked list of integers. Write a function check to whether the list given is a 'Palindrome' or not.
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

	public static boolean isPalindrome(LinkedListNode<Integer> head) {
        
        
		//Your code goes here
        if(head == null || head.next == null)
            return true;
        
        LinkedListNode<Integer> slow = head;
        LinkedListNode<Integer> fast = head;
        
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        
        LinkedListNode<Integer> head2 = slow;
        head2 = reverseLL(head2);
        
        fast = head;
        while(fast.next != slow)
            fast = fast.next;
        
        fast.next = null;
        
        slow = head;
        fast = head2;
        boolean check = true;
        
        while(fast != null && slow != null){
            if(fast.data.equals(slow.data)){
                fast = fast.next;
                slow = slow.next;
            }else{
                check = false;
                return check;
            }
        }
        
        return check;
        
        
	}
    
    public static LinkedListNode<Integer> reverseLL(LinkedListNode<Integer> head) {
        LinkedListNode<Integer> next = null;
        LinkedListNode<Integer> curr = head;
        LinkedListNode<Integer> prev = null;
        
        while(curr != null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        
        head = prev;
        
        
        
        return head;
        
    }

}