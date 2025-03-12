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
    private int solve(TreeNode root, int [] sum){
        if(root==null){
            return 0;
        }
        
        int left=solve(root.left,sum);
        int right=solve(root.right,sum);

        sum[0]+=Math.abs(left-right);
        return left+right+root.val;
        
    }
    public int findTilt(TreeNode root) {
        int [] sum={0};
        solve(root,sum);
        return sum[0];
    }
}