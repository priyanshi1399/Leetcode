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
    int maxD=0;
    Map<Integer,Integer> map=new HashMap<>();
    public void depth(TreeNode root, int d){
        if(root==null){
            return;
        }

       
        maxD=Math.max(maxD,d);
        map.put(root.val,d);

        depth(root.left,d+1);
        depth(root.right,d+1);

    }
    public TreeNode LCA(TreeNode root){
         if(root==null || map.get(root.val)==maxD){
            return root;
        }

        TreeNode left=LCA(root.left);
        TreeNode right=LCA(root.right);

        if(left!=null && right!=null){
            return root;
        }

        return left!=null?left:right;

    }
    public TreeNode lcaDeepestLeaves(TreeNode root) {
        
        depth(root,0); //passing depth as 0
    
        return LCA(root);

    }
}