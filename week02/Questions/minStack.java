package week02.Questions;

import java.util.Stack;

class minStack {
    Stack<Integer> st;
    Stack<Integer> help;
    public minStack() {
        st = new Stack<>();
        help = new Stack<>();
    }
 
    public void push(int val) {
        st.push(val);
        if(help.isEmpty() || help.peek()>=val) help.push(val);
    }
    
    public void pop() {
        // always called on non-empty stack
        int x = st.pop();
        if(!help.isEmpty() && help.peek()==x) help.pop();
    }
    
    public int top() {
        // always called on non-empty stack
        return st.peek();
    }
    
    public int getMin() {
        // always called on non-empty stack
        return help.peek();
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */
