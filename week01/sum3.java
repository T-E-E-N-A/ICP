package week01;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class sum3 {
    public List<List<Integer>> bruteForce(int[] nums){
        List<List<Integer>> li = new ArrayList<>();
        for(int i=0 ; i<nums.length ; i++){
            for(int j=i+1 ; j<nums.length ; j++){
                for(int k=j+1 ; k<nums.length ; k++){
                    if(nums[i]+nums[j]+nums[k]==0){
                        li.add(Arrays.asList(nums[i],nums[j],nums[k]));
                        break;
                    }
                }
            }
        }
        return li;
    }
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> li = new ArrayList<>();
        Arrays.sort(nums);
        for(int i=0 ; i<nums.length; i++){
            if (i > 0 && nums[i] == nums[i - 1]) {
                continue;
            }
            int start=i+1;
            int end = nums.length-1;
            while(start<end){
                int sum = nums[i]+nums[start]+nums[end];
                if(sum>0){
                    end--;
                }else if(sum<0){
                    start++;
                }else{
                    li.add(Arrays.asList(nums[i],nums[start],nums[end]));
                    start++;
                    while(nums[start]==nums[start-1] && start<end){
                        start++;
                    }
                }
            }
        }
        return li;
    }
}
