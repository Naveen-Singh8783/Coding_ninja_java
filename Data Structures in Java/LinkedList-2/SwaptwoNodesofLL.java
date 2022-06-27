/**
Question:
You have been given a singly linked list of integers along with two integers, 'i,' and 'j.' Swap the nodes that are present at the 'i-th' and 'j-th' positions.
Note :
Remember, the nodes themselves must be swapped and not the datas.

No need to print the list, it has already been taken care. Only return the new head to the list.
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

	public static LinkedListNode<Integer> swapNodes(LinkedListNode<Integer> head, int i, int j) {
		//Your code goes here
        if(head == null)
            return head;
        
        LinkedListNode<Integer> prev1 = null, curr1 = head, prev2 = null, curr2 = head;
        for(int z=0; z<i && curr1 != null; z++){
            prev1 = curr1;
            curr1 = curr1.next;
        }
        
         for(int z=0; z<j && curr2 != null; z++){
            prev2 = curr2;
            curr2 = curr2.next;
        }
        
        if(prev1 == null && prev2 == curr1){
            head = curr2;
            curr1.next = curr2.next;
            curr2.next = curr1;
        }else if(prev2 == null && prev1 == curr2){
            head = curr1;
            curr2.next = curr1.next;
            curr1.next = curr2;
        }else if(prev1 == null){
            head = curr2;
            LinkedListNode<Integer> temp = curr2.next;
            curr2.next = curr1.next;
            curr1.next = temp;
            prev2.next = curr1;      
        }else if(prev2 == null){
            head = curr1;
            LinkedListNode<Integer> temp = curr1.next;
            curr1.next = curr2.next;
            curr2.next = temp;
            prev1.next = curr2;
        }else if(prev2 == curr1){
            prev1.next = curr2;
            curr1.next = curr2.next;
            curr2.next = curr1;
        }else if(prev1 == curr2){
            prev2.next = curr1;
            curr2.next = curr1.next;
            curr1.next = curr2;    
        }else{
          LinkedListNode<Integer> temp = curr2.next;
            prev1.next = curr2;
            curr2.next = curr1.next;
            prev2.next = curr1;
            curr1.next = temp;
        }
        
        return head;
        
	}

}