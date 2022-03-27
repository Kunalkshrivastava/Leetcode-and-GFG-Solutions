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
    int min = Integer.MAX_VALUE;
    TreeNode last = null;
    public int getMinimumDifference(TreeNode root) {
        if(root == null)
            return 0;
        
        if(root.left != null){
            getMinimumDifference(root.left);
        }
        
        if(last != null)
            min = Math.min(root.val - last.val, min);
        
        last = root;
        
        if(root.right != null){
            getMinimumDifference(root.right);
        }
            
        return min;
    }
}