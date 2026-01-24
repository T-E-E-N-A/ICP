package week02.Questions;

import java.util.Scanner;

public class trappingRainwater {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] height = new int[n];
        for(int i=0 ; i<n ; i++){
            height[i] = sc.nextInt();
        }
        
        int ans = trap(height);
        System.out.println(ans);
        sc.close();
    }
    public static int trap(int[] height) {
        int ans=0;
        int n = height.length;
        int[] pre = new int[height.length];
        int[] suffix = new int[height.length];
        pre[0] = height[0];
        for(int i=1 ; i<n ; i++){
            pre[i] = Math.max(height[i],pre[i-1]);
        }
        suffix[n-1] = height[n-1];
        for(int i=n-2 ; i>=0 ; i--){
            suffix[i] = Math.max(suffix[i+1],height[i]);
        }
        for(int i=0 ; i<n; i++){
            ans += Math.min(pre[i],suffix[i])-height[i];
        }
        return ans;
    }
}
