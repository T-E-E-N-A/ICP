import java.util.*;

class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> lis = new ArrayList<>();
        if(s.length()<p.length()) return lis;
        int[] match = new int[26];
        int[] fre = new int[26];
        for(int i=0 ; i<p.length() ; i++){
            match[p.charAt(i)-'a']++;
            fre[s.charAt(i)-'a']++;
        }
        if(Arrays.equals(match,fre)){
            lis.add(0);
        }
        int i=p.length();
        int st=0;
        while(i<s.length()){
            fre[s.charAt(st)-'a']--;
            fre[s.charAt(i)-'a']++;
            st++;
            if(Arrays.equals(match,fre)) lis.add(st);
            i++;
        }
        return lis;
    }
}