package week02.Questions;

import java.util.Scanner;
import java.util.Stack;

public class infixToPostfix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String nums = sc.next();
        String ans = infixToPostFix(nums);
        System.out.println(ans);
        sc.close();
    }
    public static String infixToPostFix(String s) {
        // code here
        Stack<String> st = new Stack<>();
        StringBuilder ans = new StringBuilder();
        for(int i=0 ; i<s.length() ; i++){
            if((s.charAt(i)>='a' && s.charAt(i)<='z') || 
            (s.charAt(i)>='A' && s.charAt(i)<='Z') || (s.charAt(i)>='0' && s.charAt(i)<='9')){
                ans.append(s.charAt(i));
            }else if(s.charAt(i)=='('){
                st.push("(");
            }else if(s.charAt(i)==')'){
                while(!st.isEmpty() && !st.peek().equals("(")){
                    ans.append(st.pop());
                }
                st.pop();
            }else{
                // if operator in stack has greater priority then pull that out
                // if have same priority then need to check for ^ this operator as
                // ^  has assosiativity from right to left while others has left to right
                while(!st.isEmpty() && (priority(st.peek())>=priority(s.charAt(i)+"")) && (s.charAt(i)!='^')){
                    ans.append(st.pop());
                }
                st.push(s.charAt(i)+"");
            }
        }
        while(!st.isEmpty()) ans.append(st.pop());
        return ans+"";
    }
    // precedence function to determine priority
    public static int priority(String x){
        if(x.equals("^")) return 3;
        if(x.equals("*") || x.equals("/")) return 2;
        if(x.equals("+") || x.equals("-")) return 1;
        return -1;
    }
}
