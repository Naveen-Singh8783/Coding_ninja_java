/**
Question:
Given a singly linked list of integers, sort it using 'Merge Sort.'
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

	public static LinkedListNode<Integer> mergeSort(LinkedListNode<Integer> head) {
		//Your code goes here
        if(head == null || head.next==null) {
			return head;
		}
		LinkedListNode<Integer> middle= midPoint(head);
		LinkedListNode<Integer> head1=head,head2=middle.next;
		middle.next=null;
		
		head1=mergeSort(head1);
		head2=mergeSort(head2);
		head=merge(head1, head2);
		return head;
	}
    
    public static LinkedListNode<Integer> midPoint(LinkedListNode<Integer> head) {
        //Your code goes here
        if(head == null || head.next == null || head.next.next == null)
            return head;
        
        LinkedListNode<Integer> slow = head;
        LinkedListNode<Integer> fast = head;
        
        while(fast.next != null && fast.next.next!=null){
            slow = slow.next;
            fast = fast.next.next;
        }
        
        return slow;
    }
    
    public static LinkedListNode<Integer> merge(LinkedListNode<Integer> head1, LinkedListNode<Integer> head2) {
        //Your code goes here
        LinkedListNode<Integer> head=null,tail=null;
        if(head1 == null && head2 == null)
            return head1;
        
        if(head1 == null)
            return head2;
        
        if(head2 == null)
            return head1;
		
		while(head1!=null && head2!=null) {
			
			if(head1.data<=head2.data) {
				
				if(head==null) {
					head=head1;
					tail=head1;
				}else {
					tail.next=head1;
					tail=head1;
				}
				head1=head1.next;
				
			}else {
				
				if(head==null) {
					head=head2;
					tail=head2;
				}else {
					tail.next=head2;
					tail=head2;
				}
			head2=head2.next;	
			}
			
		}
		if(head1==null) {
			tail.next=head2;
		}
		if(head2==null) {
			tail.next=head1;
		}
		return head;
    }


}