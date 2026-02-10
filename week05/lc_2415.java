package week05;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class lc_2415 {
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
    
    public TreeNode reverseOddLevels(TreeNode root) {
        Queue<TreeNode> qu = new LinkedList<>();
        qu.add(root);
        int lvl=0;
        while(!qu.isEmpty()){
            int n = qu.size();
            Queue<TreeNode> temp = new LinkedList<>();
            Stack<Integer> st= new Stack<>();
            for(int i=0 ; i<n ; i++){
                TreeNode x = qu.poll();
                st.push(x.val);
                if(lvl%2==1) temp.add(x);
                if(x.left!=null) qu.add(x.left);
                if(x.right!=null) qu.add(x.right);
            }
            if(lvl%2==1){
                // reverse them we have stored parents as well
                while(!temp.isEmpty()){
                    TreeNode x = temp.poll();
                    x.val = st.pop();
                }
            }
            lvl++;
        }
        return root;
    }



    // OPTIMIZED SOLUTION WITH LESS EMEMORY USAGE
    public TreeNode reverseOddLevels2(TreeNode root) {
        fun(root.left,root.right,1);
        return root;
    }
    public void fun(TreeNode n1,TreeNode n2,int lvl){
        if(n1==null && n2==null) return;
        if((lvl&1)==1){
            int temp = n1.val;
            n1.val = n2.val;
            n2.val = temp;
        }
        fun(n1.left,n2.right,lvl+1);
        fun(n1.right,n2.left,lvl+1);
    }
}
