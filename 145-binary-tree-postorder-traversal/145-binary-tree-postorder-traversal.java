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
    public List<Integer> postorderTraversal(TreeNode root) {
        LinkedList<Integer> ans = new LinkedList<>();
        Stack<TreeNode> st = new Stack<>();
        TreeNode cur = root;
        
        while(cur != null || st.size()>0){
            while(cur!= null){
                st.push(cur);
                ans.addFirst(cur.val);
                cur = cur.right;
            }
            cur = st.pop();
            cur = cur.left;
        }
        return ans;
    }
}