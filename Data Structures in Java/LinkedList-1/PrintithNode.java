/***
 Question:
 For a given a singly linked list of integers and a position 'i', print the node data at the 'i-th' position.

 */
/*

 	Following is the Node class already written for the Linked List

	class LinkedListNode<T> {
		T data;
		LinkedListNode<T> next;

		public Node(T data) {
			this.data = data;
		}
	}

*/

public class Solution {

	public static void printIthNode(LinkedListNode<Integer> head, int i){
		//Your code goes here
        int index = 0;
        while(head != null ){
            
            if(index == i){
                System.out.println(head.data);
                return;
            }
            head = head.next;
            index++;
        }
	}
}