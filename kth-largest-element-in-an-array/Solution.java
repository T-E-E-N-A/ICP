
import java.util.*;

public class Solution {
    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> qu = new PriorityQueue<>(Collections.reverseOrder());
        for(int i=0 ; i<nums.length ; i++){
            qu.add(nums[i]);
        }
        for(int i=0 ;i<k-1 ; i++){
            qu.remove();
        }
        return qu.remove();
    }
}
// https://leetcode.com/problems/kth-largest-element-in-an-array/description/