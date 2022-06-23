/**
Question:
For a given singly linked list of integers, arrange the elements such that all the even numbers are placed after the odd numbers. The relative order of the odd and even terms should remain unchanged.
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

	public static LinkedListNode<Integer> evenAfterOdd(LinkedListNode<Integer> head) {
		//Your code goes here
        LinkedListNode<Integer> headOdd=null,tailOdd=null,headEven=null,tailEven=null;
		while(head!=null) {

			if(head.data%2==0) {

				if(headEven==null) {
					headEven=head;
					tailEven=head;
				}else {
					tailEven.next=head;
					tailEven=head;
				}


			}
			else {

				if(headOdd==null) {
					headOdd=head;
					tailOdd=head;
				}else {
					tailOdd.next=head;
					tailOdd=head;
				}

			}
			head=head.next;

		}
		if(headOdd==null) {
			return headEven;
		}
		if(headEven==null) {
			return headOdd;
		}
		tailOdd.next=headEven;
		tailEven.next=null;
		return headOdd;
	}
}