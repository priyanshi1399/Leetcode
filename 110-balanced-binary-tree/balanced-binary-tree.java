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
    public boolean isBalanced(TreeNode root) {
        
        if(root==null){
            return true;
        }
        
        if(check(root)!=-1){
            return true;
        }
        return false;
    }

    public int check(TreeNode node){
       
        if(node==null){
            return 0;
        }
        int l=check(node.left);
        int r=check(node.right);
         if(Math.abs(l-r)>1 || l==-1 || r==-1){
            return -1;
        }

        return 1+Math.max(l,r);
    }
}