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
    public void solve(TreeNode root,int targetSum,List<Integer> temp,List<List<Integer>> res) {
        if(root==null){
            return;
        }
        temp.add(root.val);
        if(root.left==null && root.right==null){
            if(targetSum==root.val){
                res.add(new ArrayList<>(temp));                
            }
            temp.remove(temp.size()-1);          
            return;
        }
        
        solve(root.left,targetSum-root.val,temp,res);
        solve(root.right,targetSum-root.val,temp,res);
        temp.remove(temp.size()-1);


    }
    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        List<List<Integer>> res=new ArrayList<>();
        if(root==null){
            return res;
        }

        solve(root,targetSum,new ArrayList<>(),res);
        return res;
    }
}