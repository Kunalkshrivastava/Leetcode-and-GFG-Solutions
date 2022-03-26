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
    public int height(TreeNode root){
        if(root == null){
            return -1;
        }
        return 1 + Math.max(height(root.left),height(root.right));
    }
    
    public int diameterOfBinaryTree(TreeNode root) {
        if(root == null){
            return 0;
        }
        
        int l = height(root.left);
        int r = height(root.right);
        int dl = diameterOfBinaryTree(root.left);
        int dr = diameterOfBinaryTree(root.right);
        int d = Math.max(l+r+2,Math.max(dl,dr));
        return d;
    }
}