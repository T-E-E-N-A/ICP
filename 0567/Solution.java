import java.util.*;

class Solution {
    public boolean checkInclusion(String p, String s) {
        if(s.length()<p.length()) return false;
        int[] match = new int[26];
        int[] fre = new int[26];
        for(int i=0 ; i<p.length() ; i++){
            match[p.charAt(i)-'a']++;
            fre[s.charAt(i)-'a']++;
        }
        if(Arrays.equals(match,fre)){
            return true;
        }
        int i=p.length();
        int st=0;
        while(i<s.length()){
            fre[s.charAt(st)-'a']--;
            fre[s.charAt(i)-'a']++;
            st++;
            if(Arrays.equals(match,fre)) return true;
            i++;
        }
        return false;
    }
}