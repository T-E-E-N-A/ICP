package week02.Questions;

import java.util.Scanner;
import java.util.Stack;

public class nextGreaterII {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0 ; i<n ; i++){
            arr[i] = sc.nextInt();
        }
        
        int[] ans = nextGreaterElements(arr);
        for(int x : ans){
            System.out.print(x+" ");
        }
        sc.close();
    }
    public static int[] nextGreaterElements(int[] nums) {
        // ans array to store next greater element in cyclic array
        int[] ans = new int[nums.length];

        Stack<Integer> st = new Stack<>();
        int j=0;

        // i%nums.length which lead to contigious cycling indexing 
        for(int i=0 ; j<2*nums.length ; i=(i+1)%nums.length){
            while(!st.isEmpty() && nums[st.peek()]<nums[i]){
                // System.out.println(st.peek() + " "+ nums[i]);
                ans[st.pop()] = nums[i];
            }
            // element will be pushed only once later can find only next greater element
            if(j<nums.length) st.push(i);

            // var j is maintained to limit loop
            j++;
        }
        while(!st.isEmpty()) ans[st.pop()]=-1;
        return ans;
    }
}
