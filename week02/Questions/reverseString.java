package week02.Questions;

import java.util.Scanner;
import java.util.Stack;

public class reverseString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s  = sc.next();
        System.out.println(reverse(s));
        sc.close();
    }
    public static String reverse(String s) {
        // code here
        Stack<Character> st = new Stack<>();
        StringBuilder ans = new StringBuilder();
        // pushing into stack
        for(int i=0 ; i<s.length() ; i++) st.push(s.charAt(i));
        // retreiving from stack automatically gives reverse order
        while(!st.isEmpty()) ans.append(st.pop());
        return ans+"";
    }
}
