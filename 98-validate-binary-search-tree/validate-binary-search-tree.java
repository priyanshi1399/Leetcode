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
    public boolean solve(TreeNode root,long minValue, long maxValue){
        if(root==null){
            return true;
        }
        if(root.val>minValue && root.val<maxValue){
            return (solve(root.left,minValue,root.val) && solve(root.right,root.val,maxValue));

        }
        else{
            return false;
        }
        
    }
    public boolean isValidBST(TreeNode root) {
        if(root==null){
            return true;
        }

        return solve(root,Long.MIN_VALUE,Long.MAX_VALUE);
    }
}