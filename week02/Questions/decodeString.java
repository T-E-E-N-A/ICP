package week02.Questions;

import java.util.Scanner;
import java.util.Stack;

public class decodeString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        System.out.println(decodeStringg(s));
        sc.close();
    }
    public static String decodeStringg(String s) {
        Stack<Character> st = new Stack<>();
        for(int i=0 ; i<s.length() ; i++){
            if(s.charAt(i)==']'){
                StringBuilder str = new StringBuilder();
                // make a string of characters between both brackets
                while(st.peek()!='['){
                    str.append(st.pop());
                }
                str.reverse();
                st.pop();

                // as given in ques highest length can be 300 so number can't be greater than hundredth digit place
                int a = st.pop()-'0';
                if(!st.isEmpty() && st.peek()-'0'>=0 && st.peek()-'0'<10){
                    a = a + 10*(st.pop()-'0');
                }
                if(!st.isEmpty() && st.peek()-'0'>=0 && st.peek()-'0'<10){
                    a = a + 100*(st.pop()-'0');
                }

                String app = str.toString();

                //using inbuilt function of stringBuilder to repeat string a times as 1 is already so (a-1) is passed into function
                str.append(String.valueOf(app).repeat(a-1));
                
                // pushing the whole built string back into stack
                for(int j=0 ; j<str.length() ; j++){
                    st.push(str.charAt(j));
                }
            }else{
                st.push(s.charAt(i));
            }
        }
        StringBuilder str = new StringBuilder();
        while(!st.isEmpty()){
            str.append(st.pop());
        }
        return str.reverse().toString();
    }
}
