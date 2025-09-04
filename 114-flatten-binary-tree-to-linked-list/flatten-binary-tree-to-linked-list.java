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
        Stack<TreeNode> stck=new Stack<>();
        if(root==null){
            return;
        }
        stck.push(root);
        while(!stck.isEmpty()){
            TreeNode curr=stck.pop();
            if(curr.right!=null){ //first put right because of LIFO
                stck.push(curr.right);
            }
            if(curr.left!=null){
                stck.push(curr.left);
            }

            if(!stck.isEmpty()){
                curr.right=stck.peek(); //make right pointer node
                curr.left=null;
            }
        }
    }
}