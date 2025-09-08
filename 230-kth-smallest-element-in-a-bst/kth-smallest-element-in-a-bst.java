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
    int count=0;
    public void solve(TreeNode root,int k,int [] kthSmallest){
        if(root==null){
            return;
        }
        solve(root.left,k,kthSmallest);
        count++;
        if(count==k){
            kthSmallest[0]=root.val;
        }
        solve(root.right,k,kthSmallest);

    }
    public int kthSmallest(TreeNode root, int k) {
        int [] kthSmallest={0};

        solve(root,k,kthSmallest);
        return kthSmallest[0];
    }
}