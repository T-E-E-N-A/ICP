package week02.Questions.Conversions;
import java.util.Scanner;
import java.util.Stack;

public class postfixToPrefix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String nums = sc.next();
        System.out.println(postToPre(nums));
        sc.close();
    }
    public static String postToPre(String s) {
        // code here
        Stack<String> st = new Stack<>();
        for(int i=0 ; i<s.length() ; i++){
            char ch = s.charAt(i);
            // on operator popping operand and appending
            if(ch=='+' || ch=='-' || ch=='*' || ch=='/'){
                String a = st.pop();
                // new = operator + operand1 + operand2
                st.push(s.charAt(i)+ st.pop() + a);
            }else{
                st.push(s.charAt(i)+"");    //pushing operand directly
            }
        }
        return st.pop();
    }
}
