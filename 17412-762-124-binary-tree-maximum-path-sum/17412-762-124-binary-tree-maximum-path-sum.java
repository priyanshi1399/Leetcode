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
    private int solve(TreeNode root, int [] maxSum){
        if(root==null){
            return 0;
        }

        int left=solve(root.left,maxSum);
        int right=solve(root.right,maxSum);

        
        int take_onlyOneSide=Math.max(left,right)+root.val;
        int take_both_side=root.val+left+right;
        int take_only_Root=root.val;
        maxSum[0]=Math.max(maxSum[0],Math.max(Math.max(take_onlyOneSide,take_both_side),take_only_Root));
        return Math.max((root.val+Math.max(left,right)),root.val);
    }
    public int maxPathSum(TreeNode root) {
        int [] maxSum={Integer.MIN_VALUE};
        solve(root,maxSum);
        return maxSum[0];
    }
}