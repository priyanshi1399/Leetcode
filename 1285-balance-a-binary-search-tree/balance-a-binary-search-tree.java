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
    public void inorder(TreeNode root,List<Integer> res){
        if(root==null){
            return;
        }
        inorder(root.left,res);
        res.add(root.val);
        inorder(root.right,res);
    }
    public TreeNode solve(int left,int right, List<Integer> res){
        if(left>right){
            return null;
        }

        int mid=left+(right-left)/2;
        TreeNode root=new TreeNode(res.get(mid));
        root.left=solve(left,mid-1,res);
        root.right=solve(mid+1,right,res);
        return root;
    }
    public TreeNode balanceBST(TreeNode root) {
        List<Integer> res=new ArrayList<>();
        inorder(root,res);
        int n=res.size();
        return solve(0,n-1,res);
    }
}