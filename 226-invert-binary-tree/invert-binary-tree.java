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
    public TreeNode solve(TreeNode root){
        if(root==null){
            return null;
        }
       

       TreeNode temp=root.left;
       root.left=root.right;
       root.right=temp;

        TreeNode left=solve(root.left); //now replaced nodes will be there means 7 will be at left -> 6 and 9 will be replaced first;
        TreeNode right=solve(root.right);
        return root;
    }
    public TreeNode invertTree(TreeNode root) {
        if(root==null){
            return root;
        }
        return solve(root);
        
    }
}