/**
 Question:
 You have been given two sorted(in ascending order) singly linked lists of integers.
Write a function to merge them in such a way that the resulting singly linked list is also sorted(in ascending order) and return the new head to the list.
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
    
    public static LinkedListNode<Integer> mergeTwoSortedLinkedLists(LinkedListNode<Integer> head1, LinkedListNode<Integer> head2) {
        //Your code goes here
        if(head1 == null)
            return head2;
        
        if(head2 == null)
            return head1;
        
        LinkedListNode<Integer> head = null, tail = null;
        
        while(head1 != null && head2 != null){
            if(head1.data <= head2.data){
                if(head == null){
                    head = head1;
            		tail = head1; 
                }else{
                     tail.next = head1;
                     tail = tail.next;
                }
               
                head1 = head1.next;
            }else{
                if(head == null){
                    head = head2;
           			tail = head2; 
                }else{
                    tail.next = head2;
                	tail = tail.next; 
                }
                
                head2 = head2.next;
            }
        }
        
        if(head1 != null)
            tail.next = head1;
        
        if(head2 != null)
            tail.next = head2;
        
        
        return head;       
    }

}