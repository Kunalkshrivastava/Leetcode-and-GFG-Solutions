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
    public void leaves(TreeNode root, List<Integer> a){
        if(root == null){
            return;
        }
        
        leaves(root.left,a);
        leaves(root.right,a);
        
        if(root.left == null && root.right == null){
            a.add(root.val);
        }
    }
    public boolean leafSimilar(TreeNode root1, TreeNode root2) {
        if(root1 == null && root2 == null)
            return false;
        
        List<Integer> a1 = new ArrayList<>();
        leaves(root1,a1);
        
        List<Integer> a2 = new ArrayList<>();
        leaves(root2,a2);
        
        int l1 = a1.size();
        int l2 = a2.size();
        if(l1 != l2)
            return false;
        else{
            for(int i=0; i<l1; i++){
                if(a1.get(i) != a2.get(i)){
                    return false;
                }
            }
        }
        return true;
    }
}