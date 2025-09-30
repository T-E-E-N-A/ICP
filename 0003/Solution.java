import java.util.HashSet;

class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashSet<Character> set = new HashSet<>();
        int i=0;
        int start=0;
        int ans=0;
        while(i<s.length()){
            while(set.contains(s.charAt(i)) && start<i){
                set.remove(s.charAt(start++));
            }
            set.add(s.charAt(i));
            ans = Math.max(ans,i-start+1);
            i++;
        }
        return ans;
    }
}