package week03;

import java.util.Scanner;

public class lc_3191 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];
        for(int i=0 ; i<n ; i++){
            nums[i] = sc.nextInt();
        }
        System.out.println(minOperations(nums));
        sc.close();
    }
    public static int minOperations(int[] nums) {
        int ans=0;
        for(int i=0 ; i<nums.length-2 ; i++){
            if(nums[i]==1) continue;
            nums[i] = 1-nums[i];
            nums[i+1] = 1-nums[i+1];
            nums[i+2] = 1-nums[i+2];
            ans++;
        }
        if(nums[nums.length-1]!=1 || nums[nums.length-2]!=1) return -1;
        return ans;
    }
}
