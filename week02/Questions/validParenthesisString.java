package week02.Questions;

import java.util.Scanner;

public class validParenthesisString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        System.out.println(checkValidString(s));
        sc.close();
    }
    public static boolean checkValidString(String s) {
        // unbalanced pairs/open brackets when * is treated as open bracket
        // unbalanced pair when * is treated as closed bracket
        int open=0,close=0;
        // remeber this is not count of open or close brackets it's considering
        for(int i=0 ; i<s.length() ; i++){
            char ch = s.charAt(i);
            if(ch=='('){
                open++;
                close++;
            }else if(ch==')'){
                open--;
                close--;
            }else{
                open++;
                close--;
            }
            // saare asteriks ko open maan liya tb bhi closed jyada hai
            if(open<0) return false;

            // asteriks ko close maan liya per vo "" thee
            if(close<0) close=0;
        }
        return close==0;
    }
}
