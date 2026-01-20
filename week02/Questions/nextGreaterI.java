package week02.Questions;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Stack;

public class nextGreaterI {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] nums1 = new int[n];
        int[] nums2 = new int[m];
        for(int i=0 ; i<n ; i++){
            nums1[i] = sc.nextInt();
        }
        for(int i=0 ; i<m ; i++){
            nums2[i] = sc.nextInt();
        }
        int[] ans = nextGreaterElement(nums1,nums2);
        for(int x : ans){
            System.out.print(x+" ");
        }
        sc.close();
    }
    public static int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int[] ans = new int[nums1.length];

        Map<Integer,Integer> map = new HashMap<>();

        Stack<Integer> st = new Stack<>();
        for(int i:nums2){
            while(!st.isEmpty() && st.peek()<i){
                map.put(st.pop(),i);
            }
            st.push(i);
        }
        for(int i=0 ; i<nums1.length ; i++){
            ans[i] = map.getOrDefault(nums1[i],-1);
        }
        return ans;
    }
}
