class Solution {
    public int longestOnes(int[] nums, int k) {
        int i=0;
        int st=0;
        int ans=0;
        while(i<nums.length){
            if(nums[i]==0) k--;
            while(k<0 && st<=i){
                if(nums[st++]==0) k++;
            }
            ans = Math.max(ans,i-st+1);
            i++;
        }
        return ans;
    }
}