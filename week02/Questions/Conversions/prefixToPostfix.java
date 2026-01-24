package week02.Questions.Conversions;

import java.util.Scanner;
import java.util.Stack;

public class prefixToPostfix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String nums = sc.next();
        System.out.println(preToPost(nums));
        sc.close();
    }
    public static String preToPost(String s) {
        // code here
        Stack<String> st = new Stack<>();
        for(int i=s.length()-1 ; i>=0 ; i--){
            char ch = s.charAt(i);
            // on operator popping operand and appending
            if(ch=='+' || ch=='-' || ch=='*' || ch=='/'){
                String a = st.pop();
                // new = operand2 + operand1 + operator
                st.push(a + st.pop() + s.charAt(i));
            }else{
                st.push(s.charAt(i)+"");    //pushing operand directly
            }
        }
        return st.pop();    //return answer string directly as valid conversion is given 
    }
}
