/**
Question:
Given a singly linked list of integers, reverse the nodes of the linked list 'k' at a time and return its modified list.
 'k' is a positive integer and is less than or equal to the length of the linked list. If the number of nodes is not a multiple of 'k,' then left-out nodes, in the end, should be reversed as well.
Example :
Given this linked list: 1 -> 2 -> 3 -> 4 -> 5

For k = 2, you should return: 2 -> 1 -> 4 -> 3 -> 5

For k = 3, you should return: 3 -> 2 -> 1 -> 5 -> 4
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
    
    public static LinkedListNode<Integer> reverse(LinkedListNode<Integer> head){
        LinkedListNode<Integer> pre = null;
        while(head != null){
            LinkedListNode<Integer> temp = head.next;
            head.next = pre;
            pre = head;
            head = temp;
        }
        
        return pre;
    }
    
    
    public static int lenLL(LinkedListNode<Integer> head){
        int len = 0;
        while(head != null){
            head = head.next;
            len++;
        }
        return len;
    }

	public static LinkedListNode<Integer> kReverse(LinkedListNode<Integer> head, int k) {
		//Your code goes here
        if(k >= lenLL(head))
            return reverse(head);
        
        if(head == null || head.next == null)
            return head;
        
        LinkedListNode<Integer> tempHead = head;
        for(int i=1; i<k; i++)
            head = head.next;
        LinkedListNode<Integer> temp = head.next;
        head.next = null;
        LinkedListNode<Integer> reverseHead = reverse(tempHead);
        LinkedListNode<Integer> smallAns = kReverse(temp, k);
        tempHead.next = smallAns;
        return reverseHead;
        
        
	}

}