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
    public int minDepth(TreeNode root) {
        if(root==null){
            return 0;
        }
        Queue<TreeNode> q=new LinkedList<>();
        TreeNode curr=root;
        q.add(curr);
        int depth=1;
        while(!q.isEmpty()){
            int n=q.size();
            while(n-- >0){   
            curr=q.peek();
            q.poll();
            if(curr.left==null && curr.right==null){
                return depth;
            }

            if(curr.left!=null){
                q.add(curr.left);
            }
            if(curr.right!=null){
                q.add(curr.right);
            }
            }
            depth++;    
        }
        return -1;

    }
}