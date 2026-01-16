package week01;

import java.util.Scanner;

public class findIndexOfFirstOccurrence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String t = sc.next();
        System.out.println(subString(s,t));
        sc.close();
    }
    public static int strStr(String haystack, String needle) {
        return haystack.indexOf(needle);
    }
    public static int subString(String s, String t){
        if(t.length()==0) return 0;
        if(s.length()<t.length()) return -1;

        int i=0;
        while(i+t.length()<=s.length()){
            int j=0;
            for( ; j<t.length() ; j++){
                if(s.charAt(i+j)!=t.charAt(j)) break;
            }
            if(j==t.length()) return i;
            i++;
        }
        return -1;
    }
}
