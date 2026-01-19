package week02.stackImplementation;

import java.util.ArrayList;

public class listStack {
    ArrayList<Integer> stack;
    public listStack(){
        stack = new ArrayList<>();
    }
    public boolean push(int val){
        stack.add(val);
        return true;
    }
    public int pop(){
        return stack.remove(stack.size()-1);
    }
    public int peek(){
        if(isEmpty()) return -1;
        return stack.get(stack.size()-1);
    }
    public boolean isEmpty(){
        return stack.isEmpty();
    }
}
