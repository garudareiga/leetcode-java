package min_stack;

import java.util.Stack;

/**
 * 
 * @author raychen
 * 
 * Problem:
 * Design a stack that supports push, pop, top, and retrieving the minimum 
 * element in constant time.
 * 
 * push(x) -- Push element x onto stack.
 * pop() -- Removes the element on top of the stack.
 * top() -- Get the top element.
 * getMin() -- Retrieve the minimum element in the stack.
 *
 */

public class MinStack {
    Stack<Integer> stack = new Stack<Integer>();
    Stack<Integer> minStack = new Stack<Integer>();
    
    public void push(int x) {
        stack.push(x);
        if (minStack.isEmpty() || x <= minStack.peek()) 
            minStack.push(x);
    }

    public void pop() {
        int x = stack.pop();
        if (minStack.peek() == x)
            minStack.pop();
    }

    public int top() {
        return stack.peek();
    }

    public int getMin() {
        return minStack.peek();
    }   
}
