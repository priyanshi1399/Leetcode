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
    int maxSum=0;
    public int solveDiameter(TreeNode root){
        if(root==null){
            return 0;
        }
        int left=solveDiameter(root.left);
        int right=solveDiameter(root.right);
        maxSum=Math.max(maxSum,left+right);
        return 1+Math.max(left,right);

    }
    public int diameterOfBinaryTree(TreeNode root) {
        
        if(root==null){
            return 0;
        }
        solveDiameter(root);
        return maxSum;
        
    }
}