import java.util.*;

public class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> li = new ArrayList<>();
        Arrays.sort(candidates);
        answer(li,candidates,target,new ArrayList<>(),0,0);
        return li;
    }
    public void answer(List<List<Integer>> li, int[] candidates , int target , List<Integer> ans , int sum , int ind){
        if(sum==target){
            li.add(new ArrayList<>(ans));
            return;
        }
        
        for(int i=ind ; i<candidates.length ; i++){
            if(sum+candidates[i]<=target){
                ans.add(candidates[i]);
                answer(li,candidates,target,ans,sum+candidates[i],i);
                ans.remove(ans.size()-1);
            }else{
                break;
            }
        }
    }
}