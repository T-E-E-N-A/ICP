import java.util.*;
class Solution {
    public int uniquePaths(int m, int n) {
        int[][] dp =new int[m][n];
        for(int[] dpin : dp) Arrays.fill(dpin,-1);
        return fun(m,n,0,0,dp);
    }
    public int fun(int m,int n,int i,int j,int[][] dp){
        if(i==m-1 && j==n-1) return 1;
        if(i==m || j==n) return 0;
        if(dp[i][j]!=-1) return dp[i][j];

        int a = fun(m,n,i+1,j,dp);
        int b = fun(m,n,i,j+1,dp);
        return dp[i][j] = a+b;
    }
}