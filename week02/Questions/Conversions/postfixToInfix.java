package week02.Questions.Conversions;

import java.util.Scanner;
import java.util.Stack;

public class postfixToInfix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String nums = sc.next();
        System.out.println(postToInfix(nums));
        sc.close();
    }
    public static String postToInfix(String s) {
        // code here
        Stack<String> st = new Stack<>();
        for(int i=0 ; i<s.length() ; i++){
            char ch = s.charAt(i);
            if(ch=='+' || ch=='-' || ch=='*' || ch=='/'){
                String a = st.pop();
                // by brackets we are setting priorities at every step
                st.push("("+ st.pop() + ch + a +")");
            }else{
                st.push(ch+"");
            }
        }
        return st.pop();
    }
}
