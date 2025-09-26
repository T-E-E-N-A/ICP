package Minimum_number_of_arrows_to_burst_balloons;

import java.util.Arrays;

public class Solution {
    public int findMinArrowShots(int[][] points) {
        Arrays.sort(points,(int[] a,int[] b) -> Integer.compare(a[1],b[1]));
        int arrow=1;
        int prev = points[0][1];
        for(int i=0 ; i<points.length ; i++){
            if(prev<points[i][0]){
                arrow++;
                prev = points[i][1];
            }
        }
        return arrow;
    }
}
