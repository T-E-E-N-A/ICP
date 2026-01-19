package week02.Questions;

import java.util.Scanner;
import java.util.Stack;

public class validParenthesis {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        System.out.println(isValid(s));
        sc.close();
    }
    public static boolean isValid(String s) {
        Stack<Integer> st = new Stack<>();
        for(int i=0 ; i<s.length() ; i++){
            // on close bracket remove its pair, if pair not found then return false
            // check this condition for all types of bracket
            if(!st.isEmpty() && (s.charAt(i)==')' || s.charAt(i)=='}' || s.charAt(i)==']')){
                if(s.charAt(i)==')'){
                    if(s.charAt(st.peek())!='(') return false;
                    st.pop();
                }else if(s.charAt(i)=='}'){
                    if(s.charAt(st.peek())!='{') return false;
                    st.pop();
                }else if(s.charAt(i)==']'){
                    if(s.charAt(st.peek())!='[') return false;
                    st.pop();
                }
            }else
            st.push(i);
        }
        return st.isEmpty();
    }
}
