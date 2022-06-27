/*
Question:
Given a singly linked list of integers, sort it using 'Bubble Sort.'
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
    
    public static int lenLL(LinkedListNode<Integer> head){
        int len = 0;
        while(head != null){
            len++;
            head = head.next;
        }
        
        return len;
    }

	public static LinkedListNode<Integer> bubbleSort(LinkedListNode<Integer> head) {
		//Your code goes here
        if(head == null || head.next == null)
            return head;
        
        int len = lenLL(head);
        
        for(int i=0; i<len-1; i++){
            LinkedListNode<Integer> prev=null, curr=head;
            for(int j=0; j<len-i-1; j++){
                if(curr.data <= curr.next.data){
                prev = curr;
                curr = curr.next;
            }else{
                if(prev == null){
                    LinkedListNode<Integer> front = curr.next;
                    curr.next = front.next;
                    front.next = curr;
                    prev = front;
                    head = front;
                }else{
                    LinkedListNode<Integer> front = curr.next;
                    curr.next = front.next;
                    front.next = curr;
                    prev.next = front;
                    prev = front;
                }
            }
                
          }
            
      }
        
        return head;
  }
}