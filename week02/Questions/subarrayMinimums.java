package week02.Questions;

import java.util.Scanner;
import java.util.Stack;

public class subarrayMinimums {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0 ; i<n ; i++){
            arr[i] = sc.nextInt();
        }
        
        System.out.println(sumSubarrayMins(arr));
        sc.close();
    }
    static int mod = 1_000_000_007;
    public static int sumSubarrayMins(int[] arr) {
        // stack is giving next smaller and previous smaller element 
        // ith index will be next smaller and on peeking again in stack will give previous smaller element
        Stack<Integer> st = new Stack<>();
        long ans=0;
        for(int i=0 ; i<arr.length ; i++){
            while(!st.isEmpty() && arr[st.peek()] >= arr[i]){
                int x = st.pop();
                long temp = (i-x);

                // want to find previous smaller
                // if stack is empty means no previous smaller can take -1 
                if(!st.isEmpty()){
                    temp = (temp + ((x-st.peek()-1)*temp)%mod)%mod;
                }else{
                    temp = temp + (x)*temp;
                }
                ans = (ans + (temp*arr[x])%mod)%mod;
            }
            st.push(i);
        }
        // again checking same conditions for remaining elements 
        while(!st.isEmpty()){
            int x = st.pop();
            long temp = (arr.length-x);
            if(!st.isEmpty()){
                temp += ((x-st.peek()-1)*temp)%mod;
            }else{
                temp += (x)*temp;
            }
            ans = (ans + (temp*arr[x])%mod)%mod;
        }
        return (int)(ans%mod);
    }
}
