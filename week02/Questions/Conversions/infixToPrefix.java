package week02.Questions.Conversions;

import java.util.Scanner;
import java.util.Stack;

public class infixToPrefix {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String nums = sc.next();
        String ans = infixToPreFix(nums);
        System.out.println(ans);
        sc.close();
    }
    public static String infixToPreFix(String s) {
        // code here
        Stack<String> st = new Stack<>();
        StringBuilder ans = new StringBuilder();
        for(int i=s.length()-1 ; i>=0 ; i--){
            
            // if variable then append directly
            if((s.charAt(i)>='a' && s.charAt(i)<='z') || (s.charAt(i)>='A' && s.charAt(i)<='Z') || (s.charAt(i)>='0' && s.charAt(i)<='9')){
                ans.append(s.charAt(i));
            }else if(s.charAt(i)==')'){
                // another like seperate problem in itself seperated by bracket
                st.push(")");
            }else if(s.charAt(i)=='('){
                // iterating over whole brackets
                while(!st.isEmpty() && !st.peek().equals(")")){
                    ans.append(st.pop());
                }
                st.pop();
            }else{
                // appending operators based on priority
                // if operator in stack has greater priority then pull that out
                // if have same priority then need to check for ^ this operator as
                // ^  has assosiativity from right to left while others has left to right
                while(!st.isEmpty() && ((priority(st.peek())>priority(s.charAt(i)+"")) || (priority(st.peek())==priority(s.charAt(i)+"") && (s.charAt(i)=='^')))){
                    ans.append(st.pop());
                }
                st.push(s.charAt(i)+"");
            }
        }
        // puulling out remaininig operators
        while(!st.isEmpty()){
            ans.append(st.pop());
        }

        // reversing string as created from back
        return ans.reverse().toString();
    }
    // priority checking
    public static int priority(String x){
        if(x.equals("^")) return 3;
        if(x.equals("*") || x.equals("/")) return 2;
        if(x.equals("+") || x.equals("-")) return 1;
        return -1;
    }
}
