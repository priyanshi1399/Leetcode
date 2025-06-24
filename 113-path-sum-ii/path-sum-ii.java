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
    int sum=0;
    public void solve(TreeNode root, int targetSum, List<List<Integer>> paths,List<Integer> temp){
        if(root==null){
            return;
        }
        if(root.left==null && root.right==null){
            sum+=root.val;
            System.out.println(sum);
            temp.add(root.val);
            if(sum==targetSum){
                paths.add(new ArrayList<>(temp));
            }
            sum-=root.val;
            temp.remove(temp.size()-1);
            return;
        }
        sum+=root.val;
        System.out.println(sum);
        temp.add(root.val);
        solve(root.left,targetSum,paths,temp);
        solve(root.right,targetSum,paths,temp);
        sum-=root.val;
        temp.remove(temp.size()-1);
        

    }
    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        List<List<Integer>> paths=new ArrayList<>();
        if(root==null){
            return paths;
        }
        solve(root,targetSum,paths,new ArrayList<>());
        return paths;
    }
}