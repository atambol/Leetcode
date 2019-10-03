/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    public TreeNode invertTree(TreeNode root) {
        if (root == null) {
            return root;
        }
        
        TreeNode tmp;
        tmp = root.left;
        root.left = root.right;
        root.right = tmp;
        
        invertTree(root.right);
        invertTree(root.left);
        
        return root;
    }
}
