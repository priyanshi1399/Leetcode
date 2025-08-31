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
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> res=new ArrayList<>();
        Queue<TreeNode> q=new LinkedList<>();
        if(root==null){
            return res;
        }
        q.add(root);
        while(!q.isEmpty()){
            int n=q.size();
            List<Integer> temp=new ArrayList<>();
            while(n-->0){
                TreeNode curr=q.poll();
                temp.add(curr.val);
                if(curr.right!=null){
                    q.add(curr.right);
                }
                if(curr.left!=null){
                    q.add(curr.left);
                }
            }
            res.add(temp.get(0));
        }
        return res;

    }
}