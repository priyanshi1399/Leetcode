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
    public void solve(TreeNode root, List<String> res,StringBuilder curr){
        if(root==null){
            return;
        }
        int len=curr.length(); //getting current length
        if(len==0){
            curr.append(root.val);
        }
        else{
            curr.append("->");
            curr.append(root.val);
        }
        if(root.left==null && root.right==null){ //its a leaf node
                res.add(curr.toString());
        }
        
      

        if(root.left!=null) solve(root.left,res,curr);
        if(root.right!=null) solve(root.right,res,curr);

        curr.setLength(len);

    }
    public List<String> binaryTreePaths(TreeNode root) {
        List<String> res=new ArrayList<>();
        solve(root,res,new StringBuilder());
        return res;
    }
}