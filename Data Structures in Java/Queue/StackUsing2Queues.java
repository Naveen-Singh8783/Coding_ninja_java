/**
Question:
Implement a Stack Data Structure specifically to store integer data using two Queues. You have to implement it in such a way that the push operation is done in O(1) time and the pop and top operations are done in O(N) time.
There should be two data members, both being Queues to store the data internally. You may use the inbuilt Queue.
Implement the following public functions :
1. Constructor:
It initialises the data members as required.
2. push(data) :
This function should take one argument of type integer. It pushes the element into the stack and returns nothing.
3. pop() :
It pops the element from the top of the stack and in turn, returns the element being popped or deleted. In case the stack is empty, it returns -1.
4. top :
It returns the element being kept at the top of the stack. In case the stack is empty, it returns -1.
5. size() :
It returns the size of the stack at any given instance of time.
6. isEmpty() :
It returns a boolean value indicating whether the stack is empty or not.
Operations Performed on the Stack:
Query-1(Denoted by an integer 1): Pushes an integer data to the stack.

Query-2(Denoted by an integer 2): Pops the data kept at the top of the stack and returns it to the caller.

Query-3(Denoted by an integer 3): Fetches and returns the data being kept at the top of the stack but doesn't remove it, unlike the pop function.

Query-4(Denoted by an integer 4): Returns the current size of the stack.

Query-5(Denoted by an integer 5): Returns a boolean value denoting whether the stack is empty or not.
 */

import java.util.*;

public class Stack {

    //Define the data members
    Queue<Integer> q1;
	Queue<Integer> q2;

    public Stack() {
        //Implement the Constructor
        q1 = new LinkedList<Integer>();
        q2 = new LinkedList<Integer>();
    }



    /*----------------- Public Functions of Stack -----------------*/


    public int getSize() { 
        //Implement the getSize() function
        return q1.size();
    }

    public boolean isEmpty() {
        //Implement the isEmpty() function
        return q1.isEmpty();
    }

    public void push(int element) {
        //Implement the push(element) function
        while(!q1.isEmpty())
            q2.add(q1.remove());
        
        q1.add(element);
        
        while(!q2.isEmpty())
            q1.add(q2.remove());
        
        
    }

    public int pop() {
        //Implement the pop() function
        if(q1.size() == 0)
            return -1;
        
        return q1.remove();
    }

    public int top() {
        //Implement the top() function
        if(q1.size() == 0)
            return -1;
        
        return q1.peek();
        
    }
}