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
    public int solve(TreeNode root,int [] maxSum){
        if(root==null){
            return 0;
        }

        int left=solve(root.left,maxSum);
        int right=solve(root.right,maxSum);

        int root_only_good=root.val; //only root value is good

        int either_left_Or_right=root.val+Math.max(left,right);

        int root_left_right_All= root.val+left+right;

        maxSum[0]=Math.max(maxSum[0],Math.max(Math.max(root_only_good,either_left_Or_right),root_left_right_All));
        return Math.max(root_only_good,either_left_Or_right); //will not send 3 way because that can be return value
    }
    public int maxPathSum(TreeNode root) {
        
        int [] maxSum={Integer.MIN_VALUE};
        solve(root,maxSum);
        return maxSum[0];
    }
}