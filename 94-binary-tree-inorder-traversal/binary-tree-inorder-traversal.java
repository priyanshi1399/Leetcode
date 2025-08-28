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
            if(curr.left==null) {//if this is null itself will be the root need to add
                res.add(curr.val);
                curr=curr.right;
            }
            else{
                TreeNode prev=curr.left;//assign prev node
                while(prev.right!=null && prev.right!=curr){ //a link shoulod ot be there
                        prev=prev.right;
                }
                if(prev.right==null){
                    prev.right=curr;
                    curr=curr.left; //move left because in inorder you want left first
                }
                else{
                    prev.right=null; //break the link
                    res.add(curr.val); //take curr value and move right;
                    curr=curr.right;
                }
            }
        }
        return res;
    }
}