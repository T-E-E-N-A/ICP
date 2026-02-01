package week03;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.PriorityQueue;

public class jumpGame6 {
    int[] dp;

    // METHOD-1 TIME LIMIT EXCEEDED (MEMORIZATION)
    public int maxResult1(int[] nums, int k) {
        if(k==0) k=1;
        dp = new int[nums.length];
        Arrays.fill(dp,-1);
        return fun(nums,1,k)+nums[0];
    }
    public int fun(int[] nums,int i,int k){
        if(i>=nums.length) return 0;

        if(dp[i]!=-1) return dp[i];

        int max = Integer.MIN_VALUE;
        for(int idx=i ; idx<i+k && idx<nums.length ; idx++){
            max = Math.max(max,nums[idx] + fun(nums,idx+1,k));
        }
        return dp[i] = max;
    }



    // METHOD-2 TABULATION STILL TIME LIMIT EXCEEDED
    public int maxResult2(int[] nums, int k) {
        if(k==0) k=1;
        dp = new int[nums.length];
        Arrays.fill(dp,Integer.MIN_VALUE);
        dp[0] = nums[0];

        for(int i=1 ; i<dp.length ; i++){
            int max = Integer.MIN_VALUE;
            for(int idx=i ; idx>i-k && idx>0 ; idx--){
                max = Math.max(max, dp[idx-1]);
            }
            dp[i] = Math.max(dp[i],nums[i]+max);
        }
        return dp[dp.length-1];
    }


    // METHOD-3 TABULATION + DPriorityQueue: ACCEPTED(but less optimized)
    public int maxResult3(int[] nums, int k) {
        if(k==0) k=1;
        int[] dp = new int[nums.length];
        PriorityQueue<int[]> pq = new PriorityQueue<>((a,b)->(b[1]-a[1]));
        dp[0] = nums[0];
        pq.add(new int[]{0,nums[0]});

        for(int i=1 ; i<dp.length ; i++){
            while(!pq.isEmpty() && pq.peek()[0]<(i-k)){
                pq.poll();
            }
            dp[i] = nums[i]+pq.peek()[1];
            pq.add(new int[]{i,dp[i]});
        }
        return dp[dp.length-1];
    }


    // TABULATION + DEQUEUE : More Optimized
    // comments of priorityQueue are telling substitute in DeQueue in this Question
    public int maxResult(int[] nums, int k) {
        if(k==0) k=1;
        int[] dp = new int[nums.length];
       ArrayDeque<Integer> dq = new ArrayDeque<>();
        dp[0] = nums[0];

        // pq.add(new int[]{0,nums[0]});
        dq.add(0);

        for(int i=1 ; i<dp.length ; i++){
            // while(!pq.isEmpty() && pq.peek()[0]<(i-k)){
            //     pq.poll();
            // }
            while(!dq.isEmpty() && dq.peekFirst()<i-k) dq.pollFirst();

            dp[i] = nums[i]+ dp[dq.peek()];

            // pq.add(new int[]{i,dp[i]});
            while(!dq.isEmpty() && dp[i]>dp[dq.peekLast()]) dq.pollLast();
            dq.add(i);
        }
        return dp[dp.length-1];
    }
}
