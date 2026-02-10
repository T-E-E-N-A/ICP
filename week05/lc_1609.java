package week05;

import java.util.LinkedList;
import java.util.Queue;

public class lc_1609 {
    class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode() {}
        TreeNode(int val) { this.val = val; }
        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }
    public boolean isEvenOddTree(TreeNode root) {
        Queue<TreeNode> qu = new LinkedList<>();
        qu.add(root);
        int lvl=0;
        while(!qu.isEmpty()){
            int n = qu.size();
            int prev = Integer.MIN_VALUE;
            if((lvl&1)==1){
                prev = Integer.MAX_VALUE;
            }
            for(int i=0 ; i<n ; i++){
                TreeNode x = qu.poll();
                // some logic here
                if((lvl&1)==1){
                    if(prev<=x.val || ((x.val&1)==1)) return false;
                    prev = x.val;
                }else{
                    if(prev>=x.val || ((x.val&1)==0)) return false;
                    prev = x.val;
                }
                if(x.left!=null) qu.add(x.left);
                if(x.right!=null) qu.add(x.right);
            }
            lvl++;
        }
        return true;
    }
}
