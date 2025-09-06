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
    public void backtrack (TreeNode root,List<List<Integer>> res, List<Integer> temp,int targetSum){
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
        backtrack(root.left,res,temp,targetSum-root.val);
        backtrack(root.right,res,temp,targetSum-root.val);
        temp.remove(temp.size()-1);

    }
    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        List<List<Integer>> res=new ArrayList<>();
        if(root==null){
            return res;
        }

        
        backtrack(root,res,new ArrayList<>(),targetSum);
        return res;
    }
}