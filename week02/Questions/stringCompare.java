package week02.Questions;

import java.util.Stack;

public class stringCompare {
    public boolean backspaceCompare(String s, String t) {
        Stack<Character> st  = new Stack<>();
        for(int i=0 ; i<s.length() ; i++){
            if(s.charAt(i)=='#'){
                if(!st.isEmpty()) st.pop();
            }else st.add(s.charAt(i));
        }
        Stack<Character> st2  = new Stack<>();
        for(int i=0 ; i<t.length() ; i++){
            if(t.charAt(i)=='#'){
                if(!st2.isEmpty()) st2.pop();
            }else st2.add(t.charAt(i));
        }
        while(!st.isEmpty() && !st2.isEmpty()){
            if(st.pop()!=st2.pop()) return false;
        }
        return (st.isEmpty() && st2.isEmpty());
    }
}