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
    int curr=0;
    public int solve(TreeNode root, int curr){

        if(root==null){
            return 0;
        }
        curr=2*curr+root.val;
        if(root.left==null && root.right==null){
            return curr;
        }

        int left=solve(root.left,curr);
        int right=solve(root.right,curr);

        return left+right;
    }
    public int sumRootToLeaf(TreeNode root) {
        return solve(root,curr);
        

    }
}