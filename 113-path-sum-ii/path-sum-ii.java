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
    public void solve(TreeNode root,int targetSum,List<List<Integer>> res,List<Integer> temp){
        if(root==null){
            return;
        }
        if(root.left==null && root.right==null){
            if(root.val==targetSum){
                temp.add(root.val);
                res.add(new ArrayList<>(temp));
                temp.remove(temp.size()-1);
            }
            return;
        }

        temp.add(root.val);
        solve(root.left,targetSum-root.val,res,temp);
        solve(root.right,targetSum-root.val,res,temp);
        temp.remove(temp.size()-1);
    }
    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        List<List<Integer>> res=new ArrayList<>();
        if(root==null){
            return res;
        }

        solve(root,targetSum,res,new ArrayList<>());
        return res;
    }
}