package week02.Questions;

import java.util.Scanner;
import java.util.Stack;

public class helpClassmates {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0 ; i<n ; i++){
            arr[i] = sc.nextInt();
        }
        
        int[] ans = help_classmate(arr,n);
        for(int x : ans){
            System.out.print(x+" ");
        }
        sc.close();
    }
    public static int[] help_classmate(int arr[], int n) {
        // Your code goes here
        int[] ans = new int[n];
        Stack<Integer> st = new Stack<>();
        for(int i=0 ; i<n ; i++){
            while(!st.isEmpty() && arr[st.peek()]>arr[i]){
                ans[st.pop()] = arr[i];
            }
            st.push(i);
        }
        while(!st.isEmpty()) ans[st.pop()]=-1;
        return ans;
    }
}
