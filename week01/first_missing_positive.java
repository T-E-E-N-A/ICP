package week01;

public class first_missing_positive {
    public int firstMissingPositive(int[] nums) {
        // cyclic sort
        answer(nums);
        for(int i=0 ; i<nums.length ; i++){
            if(i+1 != nums[i]){
                return i+1;
            }
        }
        return nums.length+1;
    }
    public static void answer(int[] nums){
        int i=0;
        while(i<nums.length){
            if(nums[i]>0 && nums[i]<=nums.length && nums[i]!=nums[nums[i]-1]){
                // nums should be at index ind
                int ind = nums[i]-1;
                
                // swapping temp and element at ind
                int temp = nums[ind];
                nums[ind] = nums[i];
                nums[i] = temp;
            }else{
                i++;
            }
        }
    }
}