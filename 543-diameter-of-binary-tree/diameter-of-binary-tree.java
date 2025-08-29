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
      int max = Integer.MIN_VALUE;
    public int diameterOfBinaryTree(TreeNode root) {
    solve(root,0);    
    return max;
    }
    public int solve(TreeNode root, int path) {

    if(root == null) {
        return 0;
    }
    int left = solve(root.left, path);
    int right = solve(root.right, path);
    
    //ok, the longest path passing through me is left + right
    max = Math.max(max, left + right);
    
    //The height of the tree rooted at this node is 1(current node) plus the taller child’s height
    return 1+Math.max(left,right);
}
}