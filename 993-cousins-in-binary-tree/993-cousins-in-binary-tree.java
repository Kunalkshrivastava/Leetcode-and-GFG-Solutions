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
    public boolean isCousins(TreeNode root, int x, int y) {
        if(root == null)
            return false;
        
        LinkedList<TreeNode> q = new LinkedList<>();
        q.addLast(root);
        while(q.size()>0){
            int l = q.size();
            int a = 0;
            int b = 0;
            for(int i=0; i< l; i++){
                TreeNode temp = q.removeFirst();
                if(temp.val == x)
                    a = 1;
                if(temp.val == y)
                    b = 1;
                
                if(temp.left != null && temp.right != null){
                    if(temp.left.val == x && temp.right.val == y)
                        return false;
                    if(temp.left.val == y && temp.right.val == x)
                        return false;
                }
                
                if(temp.left != null) q.addLast(temp.left);
                if(temp.right != null) q.addLast(temp.right);
            }
            if(a == 1 && b == 1)
                return true;
            /*
            a = 0;
            b = 0;*/
        }
        return false;
    }
}