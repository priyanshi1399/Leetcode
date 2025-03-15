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
    public void flatten(TreeNode root) {
        if(root==null){
            return;
        }
        Stack<TreeNode> stck=new Stack<>();
        stck.push(root);
        while(!stck.isEmpty()){
            TreeNode curr=stck.peek();
            stck.pop();
            if(curr.right!=null){
                stck.push(curr.right);
            }
            if(curr.left!=null){
                stck.push(curr.left);
            }

            if(!stck.isEmpty()){
                curr.right=stck.peek();
            }
            curr.left=null;
        }

    }
}