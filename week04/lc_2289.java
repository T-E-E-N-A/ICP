package week04;

import java.util.Stack;

public class lc_2289 {
    public int totalSteps(int[] nums) {
        Stack<int[]> st = new Stack<>();
        for(int i=nums.length-1 ; i>=0 ; i--){
            int[] arr = new int[2];
            arr[0]= nums[i];
            while(!st.isEmpty() && st.peek()[0]<nums[i]){
                int[] x = st.pop();
                arr[1] = Math.max(arr[1]+1,x[1]);
            }
            st.push(arr);
        }
        int ans=0;
        while(!st.isEmpty()){
            ans = Math.max(ans,st.pop()[1]);
        }
        return ans;
    }
}
