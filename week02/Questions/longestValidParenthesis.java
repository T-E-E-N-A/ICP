package week02.Questions;

import java.util.Scanner;
import java.util.Stack;

public class longestValidParenthesis {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        System.out.println(longestValidParentheses(s));
        sc.close();
    }
    public static int longestValidParentheses(String s) {
        Stack<Integer> st = new Stack<>();
        int max=0;
        for(int i=0 ;i<s.length() ; i++){
            if(s.charAt(i)=='('){
                st.push(i);
            }else{
                // if checking valid string
                if(!st.isEmpty() && s.charAt(st.peek())=='('){
                    st.pop();
                    // if valid then calculate length based on previous of stack
                    if(!st.isEmpty()){
                        max = Math.max(max,i-st.peek());
                    }else{
                        max = Math.max(max,i+1);
                    }
                }else{
                    // if not valid just put that index in stack
                    st.push(i);
                }
            }
        }
        return max;
    }

}
