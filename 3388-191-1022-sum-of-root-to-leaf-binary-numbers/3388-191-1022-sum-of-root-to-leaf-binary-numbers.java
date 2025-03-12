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
    private int solve(TreeNode root, int curr,int [] sum){
        if(root==null){
            return 0;
        }
        curr=2*curr+root.val;
        if(root.left==null && root.right==null){
            return curr;
        }
        int l=solve(root.left,curr,sum);
        int r=solve(root.right,curr,sum);

        
        return l+r;
    }
    public int sumRootToLeaf(TreeNode root) {
        int curr=0;
        int [] sum={0};
        return solve(root,curr,sum);
        
    }
}