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
    public List<List<Integer>> levelOrder(TreeNode root) {
        
        List<List<Integer>> ans = new ArrayList<>();
        
        if(root == null)
            return ans;
        
        LinkedList<TreeNode> q = new LinkedList<>();
        q.addLast(root);
        while(q.size() > 0){
            int size = q.size();
            List<Integer> l = new ArrayList<>();    
            
                for(int i=0; i< size; i++){
                    TreeNode t = q.removeFirst();
                    l.add(t.val);
                    if(t.left != null){
                        q.addLast(t.left);
                    }
                    if(t.right != null){
                        q.addLast(t.right);
                    }
                }
            ans.add(l);
        }
        return ans;
    }
}