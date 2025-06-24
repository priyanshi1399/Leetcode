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
    public boolean solve(TreeNode root, int targetSum){
        if(root==null){
            return false;
        }
        if(root.left==null && root.right==null){
            if(root.val==targetSum){
                return true;
            }
        }

        if(solve(root.left, targetSum-root.val) || solve(root.right,targetSum-root.val)){
            return true;
        }

        return false;
    }
    public boolean hasPathSum(TreeNode root, int targetSum) {
        if(root==null){
            return false;
        }
        return solve(root, targetSum);
            
    }
}