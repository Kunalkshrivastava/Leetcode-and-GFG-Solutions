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
    public List<Double> averageOfLevels(TreeNode root) {
        if(root == null){
            return new ArrayList<Double>();
        }
        List<Double> ans = new ArrayList<>();
        LinkedList<TreeNode> q = new LinkedList<>();
        q.addLast(root);
        
        while(q.size() > 0){
            int l = q.size();
            double cal = 0;
            for(int i=0; i<l ; i++){
                TreeNode temp = q.removeFirst();
                cal = cal + temp.val;
                if(temp.left != null)
                    q.addLast(temp.left);
                if(temp.right != null)
                    q.addLast(temp.right);
            }
            ans.add(cal/l);
        }
        return ans;
    }
}