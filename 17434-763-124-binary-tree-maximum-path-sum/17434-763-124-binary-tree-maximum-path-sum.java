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
    public int solve(TreeNode root, int [] maxSum){
        if(root==null){
            return 0;
        }
       
       int l=solve(root.left,maxSum);
       int r=solve(root.right,maxSum);

       int got_ans_below=l+r+root.val;

       int only_root_good=root.val;

       int only_one_good_left_Right=Math.max(l,r)+root.val;

       maxSum[0]=Math.max(maxSum[0],Math.max(Math.max(got_ans_below,only_root_good),only_one_good_left_Right));

       return Math.max(only_root_good,only_one_good_left_Right);

    }
    public int maxPathSum(TreeNode root) {
        
        int [] maxSum={Integer.MIN_VALUE};

        solve(root,maxSum);
        return maxSum[0];
    }
}