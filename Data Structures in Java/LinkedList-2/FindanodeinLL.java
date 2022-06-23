/**
Question:
Given a singly linked list of integers and an integer n, find and return the index for the first occurrence of 'n' in the linked list. -1 otherwise.
Follow a recursive approach to solve this.
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


	public static int findNodeRec(LinkedListNode<Integer> head, int n) {
    	//Your code goes here
        
      return findNodeRec(head, n, 0);
	}
    
    public static int findNodeRec(LinkedListNode<Integer> head, int n, int pos) {
    	//Your code goes here
        if(head == null)
            return -1;
        if(head.data.equals(n))
            return pos;
        
        return findNodeRec(head.next, n, pos+1);
        
	}

}