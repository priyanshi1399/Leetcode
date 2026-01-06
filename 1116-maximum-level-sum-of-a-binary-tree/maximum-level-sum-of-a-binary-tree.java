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
    public int maxLevelSum(TreeNode root) {
        if(root==null){
            return 0;
        }
        Queue<TreeNode> q=new LinkedList<>();
        q.add(root);
        int ans=0;
        int maxSum=Integer.MIN_VALUE;
        int level=0;
        while(!q.isEmpty()){
            int sum=0;
            int n=q.size();
            while(n-->0){
            TreeNode temp=q.poll();
            sum+=temp.val;
                if(temp.left!=null){
                    q.add(temp.left);
                }
                if(temp.right!=null){
                    q.add(temp.right);
                }
            }
            level++;
            if(sum>maxSum){
                ans=level;
                maxSum=sum;
            }        
        }
        return ans;
        
    }
}