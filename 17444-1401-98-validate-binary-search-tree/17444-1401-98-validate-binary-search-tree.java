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
    private boolean helper(TreeNode root, long minVal,long maxVal){
        if(root==null){
            return true;
        }
        if(root.val>minVal && root.val<maxVal){
            return helper(root.left,minVal,root.val) && helper(root.right,root.val,maxVal);
        }
        else{
            return false;
        }
    }
    public boolean isValidBST(TreeNode root) {
        return helper(root, Long.MIN_VALUE,Long.MAX_VALUE);

    }
}