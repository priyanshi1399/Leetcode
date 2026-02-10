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
    public void inorder(TreeNode root, List<Integer> ans){
        if(root==null){
            return;
        }
        inorder(root.left,ans);
        ans.add(root.val);
        inorder(root.right,ans);

    }
    public TreeNode solve(int left,int right,List<Integer> ans){
        if(left>right){
            return null;
        }
        int mid=left+(right-left)/2;
        TreeNode root=new TreeNode(ans.get(mid));
        root.left=solve(left,mid-1,ans);
        root.right=solve(mid+1,right,ans);
        return root;
    }
    public TreeNode balanceBST(TreeNode root) {
        List<Integer> ans=new ArrayList<>();
        inorder(root,ans);
        int n=ans.size();
        return solve(0,n-1,ans);
    }
}