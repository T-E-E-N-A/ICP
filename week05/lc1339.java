package week05;

public class lc1339 {
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
    int mod = 1_000_000_007;
    long ans;
    long total;
    public int maxProduct(TreeNode root) {
        ans=0;
        total=dfs(root);
        dfs2(root);
        return (int)(ans%mod);
    }
    public long dfs2(TreeNode root){
        if(root==null) return 0;
        long a = dfs2(root.left);
        long b = dfs2(root.right);
        ans =  Math.max(ans,(a*(total-a)));
        ans =  Math.max(ans,(b*(total-b)));
        return a + b+root.val;
    }
    public long dfs(TreeNode root){
        if(root==null) return 0;
        return (dfs(root.left) + dfs(root.right) + root.val);
    }
}