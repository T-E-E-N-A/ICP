package week02.Questions.Conversions;

import java.util.Scanner;
import java.util.Stack;

public class evaluatePostFix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] nums1 = new String[n];
        for(int i=0 ; i<n ; i++){
            nums1[i] = sc.next();
        }
        int ans = evaluatePostfix(nums1);
        System.out.println(ans);
        sc.close();
    }
    public static int evaluatePostfix(String[] arr) {
        // code here
        // Stack for integers i.e. values and solved one 
        Stack<Integer> st =   new Stack<>();
        
        for(int i=0 ; i<arr.length ; i++){
            // if integer then go in stack
            if(Character.isDigit(arr[i].charAt(0)) || (arr[i].length()>1 && Character.isDigit(arr[i].charAt(1)))){
                st.push(Integer.parseInt(arr[i]));
            }else{
                // if operation then get evaluated
                int b = st.pop();
                int a = st.pop();
                if(arr[i].equals("+")){
                    st.push(a+b);
                }else if(arr[i].equals("-")){
                    st.push(a-b);
                }else if(arr[i].equals("*")){
                    st.push(a*b);
                }else if(arr[i].equals("/")){
                    int x = divide(a,b);
                    st.push(x);
                }else{
                    int x = (int)Math.pow(a,b);
                    st.push(x);
                }
            }
        }
        return st.pop();
    }
    // condition for divide is special in question
    // a specific fn to perform that divide
    public static int divide(int a,int b){
        if(a*b>=0) return a/b;
        return (a/b) - ((a%b==0)?0:1);
    }
}
