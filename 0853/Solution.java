import java.util.*;

class Solution {
    public int carFleet(int target, int[] position, int[] speed) {
        int[][] arr = new int[position.length][2];
        for(int i=0 ; i<arr.length ; i++){
            arr[i][0] = position[i];
            arr[i][1] = speed[i];
        }
        Arrays.sort(arr,(a,b)->{ return a[0]-b[0];});
        
        Stack<Double> st = new Stack<>();
        for(int[] i : arr){
            if(i[0]>target) continue;
            double steps = (target-i[0])/(1.0*i[1]);
            while(!st.isEmpty() && st.peek()<=steps){
                st.pop();
            }
            st.push(steps);
        }
        return st.size();
    }
}