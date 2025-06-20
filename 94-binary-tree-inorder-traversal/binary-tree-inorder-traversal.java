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
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> res=new ArrayList<>();
        TreeNode curr=root;
        while(curr!=null){
            if(curr.left==null){
                res.add(curr.val); //itself the root added bcz left is null
                curr=curr.right; //move right
            }
            else{
                TreeNode prev=curr.left; //go to left of the root
                while(prev.right!=null && prev.right!=curr ){ //already thread exists
                    prev=prev.right;
                }
                if(prev.right==null){ //if reached at the end of the prev make a thread
                    prev.right=curr;
                    curr=curr.left; //move towards new node at the left
                }
                else{ //where it is already having the link
                    prev.right=null; // remove the thread
                    res.add(curr.val);
                    curr=curr.right; //already linked earlier
                }

            }
        }
        return res;
    }
}