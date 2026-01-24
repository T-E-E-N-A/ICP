package week02.Questions;

import java.util.Scanner;
import java.util.Stack;

public class removeKDigits {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        String s = sc.next();
        System.out.println(removeKdigits(s, k));
        sc.close();
    }

    public static String removeKdigits(String num, int k) {
        Stack<Integer> st = new Stack<>();
        // increasing stack
        for(int i=0 ; i<num.length() ; i++){
            while(!st.isEmpty() && k>0 && num.charAt(st.peek())>num.charAt(i)){
                st.pop();
                k--;
            }
            st.push(i);
        }
        StringBuilder ans = new StringBuilder();

        // removing elemnt we can remove to shorten length
        while(!st.isEmpty() && k>0){
            st.pop();
            k--;
        }

        // popping all elements to string
        while(!st.isEmpty()){
            ans.append(num.charAt(st.pop()));
        }

        // removing zeroes from start formed by deleting precedding characters
        while(ans.length()>0 && ans.charAt(ans.length()-1)=='0'){
            ans.deleteCharAt(ans.length()-1);
        }
        if(ans.length()==0) return "0";
        return ans.reverse().toString(); //reversing as stack returns in reverse order
    }
}
