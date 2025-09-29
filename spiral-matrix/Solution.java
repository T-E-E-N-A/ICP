import java.util.*;

class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> lis = new ArrayList<>();
        int rs=0,re=matrix.length-1;
        int cs=0,ce=matrix[0].length-1;
        int ele=0;
        int total=matrix.length*matrix[0].length;
        while(ele<total){

            for(int i=cs ; i<=ce && ele<total ; i++){
                lis.add(matrix[rs][i]);
                ele++;
            }
            rs++;

            for(int i=rs ; i<=re && ele<total ; i++){
                lis.add(matrix[i][ce]);
                ele++;
            }
            ce--;

            for(int i=ce; i>=cs && ele<total ; i--){
                lis.add(matrix[re][i]);
                ele++;
            }
            re--;

            
            for(int i=re ; i>=rs && ele<total ; i--){
                lis.add(matrix[i][cs]);
                ele++;
            }
            cs++;
        }
        return lis;
    }
}