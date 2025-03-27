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
    List<List<Integer>> result=new ArrayList<>();
    private void solve(TreeNode root, int remainingSum,List<Integer> path){
        if(root==null){
            return;
        }

        path.add(root.val);
        if(root.left==null && root.right==null && remainingSum==root.val){
            result.add(new ArrayList<>(path));
        }
        solve(root.left,remainingSum-root.val,path);
        solve(root.right,remainingSum-root.val,path);
        path.remove(path.size()-1);
    }
    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        List<Integer> path=new ArrayList<>();
        solve(root,targetSum,path);
        return result;
    }
}