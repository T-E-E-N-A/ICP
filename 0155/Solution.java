import java.util.Stack;

class MinStack {
    Stack<Integer> st;
    int min = Integer.MAX_VALUE;
    Stack<Integer> helper;
    public MinStack() {
        st = new Stack<>();
        helper = new Stack<>();
    }
    
    public void push(int val) {
        st.push(val);
        if(helper.isEmpty() || st.peek()<=helper.peek()){
            helper.push(val);
        }
    }
    
    public void pop() {
        int x = st.pop();
        if(!helper.isEmpty() && helper.peek()==x) helper.pop();
    }
    
    public int top() {
        return st.peek();
    }
    
    public int getMin() {
        if(helper.isEmpty()) return st.peek();
        return helper.peek();
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