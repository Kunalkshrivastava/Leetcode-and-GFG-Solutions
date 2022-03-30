/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    /*public int maxDepth(TreeNode root) {
        if(root == null)
            return 0;
        
        int l = maxDepth(root.left);
        int r = maxDepth(root.right);
        return 1 + Math.max(l,r);
    }*/
    public int maxDepth(TreeNode root) {
        if(root == null) return 0;
        int depth = 0;
        LinkedList<TreeNode> q = new LinkedList<TreeNode>();
        q.addLast(root);
        while(!q.isEmpty()){
            int size = q.size();
            // for each level
            for(int i=0;i<size;i++){
                TreeNode node = q.removeFirst();
                /*
                if(node.left == null && node.right == null){
                    return depth;
                }*/
                if(node.left != null){
                    q.addLast(node.left);
                }
                if(node.right != null){
                    q.addLast(node.right);
                }
            }
            depth++;
        }
        return depth;
    }
}