package week02.Questions;

import java.util.Stack;

public class deleteMid {
    public void deleteMid(Stack<Integer> s) {
        // code here
        fun(s,(s.size()-(s.size()%2))/2);
    }
    public void fun(Stack<Integer> st,int ele){
        if(ele==0){
            st.pop();
            return;
        }
        int x = st.pop();
        fun(st,ele-1);
        st.push(x);
    }
}
