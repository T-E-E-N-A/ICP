package week02.stackImplementation;

public class arrayStack {
    int[] stack;
    int idx;
    public arrayStack(int n){
        stack = new int[n];
        idx=-1;
    }
    public boolean push(int val){
        if(isFull()) return false;
        stack[idx+1] = val;
        idx++;
        return true;
    }
    public int pop(){
        if(isEmpty()) return -1;
        return stack[idx--];
    }
    public int peek(){
        if(isEmpty()) return -1;
        return stack[idx];
    }
    public boolean isFull(){
        if(idx==stack.length-1) return true;
        return false;
    }
    public boolean isEmpty(){
        if(idx==-1) return true;
        return false;
    }
}
