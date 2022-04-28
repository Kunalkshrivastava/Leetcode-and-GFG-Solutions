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
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> ans = new ArrayList<>();
        Stack<TreeNode> st = new Stack<>();
        TreeNode cur = root;
        
        while(cur!= null || st.size()>0){
            while(cur!=null){
                ans.add(cur.val);
                st.push(cur);
                cur = cur.left;
            }
            cur = st.pop();
            cur = cur.right;
        }
        return ans;
    }
}