import java.util.*;

public class Solution {
    public int findMinArrowShots(int[][] points) {
        Arrays.sort(points,(a,b)->Integer.compare(a[1],b[1]));
        int arrow=0;
        long num=Long.MIN_VALUE;
        for(int i=0 ; i<points.length ;i++){
            if(num<points[i][0]){
                arrow++;
                num = points[i][1];
            }
        }
        return arrow;
    }
}
