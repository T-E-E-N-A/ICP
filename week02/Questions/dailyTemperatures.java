package week02.Questions;

import java.util.Scanner;
import java.util.Stack;

public class dailyTemperatures {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0 ; i<n ; i++){
            arr[i] = sc.nextInt();
        }
        
        int[] ans = dailyTemperature(arr);
        for(int x : ans){
            System.out.print(x+" ");
        }
        sc.close();
    }
    public static int[] dailyTemperature(int[] temperatures) {
        int[] ans = new int[temperatures.length];

        Stack<Integer> st = new Stack<>();
        for(int i=0 ; i<temperatures.length ; i++){
            while(!st.isEmpty() && temperatures[st.peek()]<temperatures[i]){
                int x = st.pop();
                ans[x] = i-x;
            }
            st.push(i);
        }
        while(!st.isEmpty()) ans[st.pop()]=0;
        return ans;
    }
}
