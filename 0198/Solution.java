class Solution {
    public int rob(int[] nums) {
        int[] dp = new int[nums.length+1];

        dp[1] = nums[0];
        for(int i=2 ; i<dp.length ; i++){
            dp[i] = Math.max(dp[i-2]+nums[i-1],dp[i-1]);
        }
        return dp[dp.length-1];
    }
}

/*
RECURSIVE APPROACH

class Solution {
    public int rob(int[] nums) {
        return fun(nums,0);
    }
    public int fun(int[] nums,int idx){
        if(idx>=nums.length) return 0;

        int a = fun(nums,idx+2) + nums[idx];
        int b = fun(nums,idx+1);
        return Math.max(a,b); 
    }
}

*/