package week02.Questions;

import java.util.Scanner;
import java.util.Stack;

public class largestRectangleHistogram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] heights = new int[n];
        for(int i=0 ; i<n ; i++){
            heights[i] = sc.nextInt();
        }
        
        int ans = largestRectangleArea(heights);
        System.out.println(ans);
        sc.close();
    }

    public static int largestRectangleArea(int[] heights) {
        Stack<Integer> st = new Stack<>();
        int ans=0;
        for(int i=0 ; i<heights.length ; i++){
            while(!st.isEmpty() && heights[st.peek()]>heights[i]){
                int h = heights[st.pop()];
                if(!st.isEmpty()){
                    ans = Math.max(ans,h*(i-st.peek()-1));
                }else{
                    ans = Math.max(ans,h*i);
                }
            }
            st.push(i);
        }
        while(!st.isEmpty()){
            int h = heights[st.pop()];
            int i = heights.length;
            if(!st.isEmpty()){
                ans = Math.max(ans,h*(i-st.peek()-1));
            }else{
                ans = Math.max(ans,h*i);
            }
        }
        return ans;
    }
}
