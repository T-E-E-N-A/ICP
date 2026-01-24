package week02.Questions.Conversions;

import java.util.Scanner;
import java.util.Stack;

public class prefixToInfix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String nums = sc.next();
        System.out.println(preToInfix(nums));
        sc.close();
    }
    public static String preToInfix(String s) {
        // code here
        Stack<String> st = new Stack<>();
        for(int i=s.length()-1 ; i>=0 ; i--){
            char ch = s.charAt(i);
            if(ch=='+' || ch=='-' || ch=='*' || ch=='/'){
                String a = st.pop();
                // by brackets we are setting priorities at every step
                st.push("("+ a + ch + st.pop() +")");
            }else st.push(ch+"");
        }
        return st.pop();
    }
}
