package week03;

import java.util.Scanner;

public class lc_2444 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int minK = sc.nextInt();
        int maxK = sc.nextInt();
        int[] nums = new int[n];
        for(int i=0 ; i<n ; i++) nums[i] = sc.nextInt();
        System.out.println(countSubarrays(nums, minK, maxK));
        sc.close();
    }
    public static long countSubarrays(int[] nums, int minK, int maxK) {
        long count = 0;
        int start = -1, mini = -1, maxi = -1;
        for (int i = 0; i < nums.length; i++) {
            // resetting the range as if deafulty element will be found no subarray can be made with them
            if (nums[i] < minK || nums[i] > maxK) start = i;
            if (nums[i] == maxK) maxi = i;
            if (nums[i] == minK) mini = i;
            int valid = Math.max(0, Math.min(mini, maxi) - start);
            count += valid;
        }
        return count;
    }
}
