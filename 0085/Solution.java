import java.util.*;
class Solution {
    public int maximalRectangle(char[][] matrix) {
        int ans=0;
        int[] grid = new int[matrix[0].length];
        for(int i=0 ; i<matrix.length ; i++){
            for(int j=0 ; j<matrix[0].length ; j++){
                grid[j] = (matrix[i][j]=='1')? grid[j]+1 : 0;
            }
            ans = Math.max(ans,histogram(grid));
        }
        return ans;
    }
    public int histogram(int[] grid){
        Stack<Integer> st = new Stack<>();
        int ans=0;
        // increasing monotonic stack
        // 3 1 3 2 2
        // 0 1 2 3 4
        for(int i=0 ; i<grid.length ; i++){
            while(!st.isEmpty() && grid[st.peek()]>=grid[i]){
                int h = grid[st.pop()];
                if(!st.isEmpty()){
                    ans = Math.max(ans,h*(i-st.peek()-1));
                }else{
                    ans = Math.max(ans,h*i);
                }
            }
            st.push(i);
        }
        while(!st.isEmpty()){
            int h = grid[st.pop()];
            if(!st.isEmpty()){
                ans = Math.max(ans,h*(grid.length-st.peek()-1));
            }else{
                ans = Math.max(ans,h*grid.length);
            }
        }
        return ans;
    }
}