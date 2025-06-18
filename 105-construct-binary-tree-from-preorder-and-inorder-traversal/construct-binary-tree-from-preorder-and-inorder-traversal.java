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
    HashMap<Integer,Integer> map=new HashMap<>();
    int n;
    int idx=0;
    public TreeNode solve(int[] preorder,int start,int end){
        if(start>end){
            return null;
        }

        TreeNode root=new TreeNode(preorder[idx]);

        int i=map.get(root.val);
        idx++;
        root.left=solve(preorder,start,i-1);
        root.right=solve(preorder,i+1,end);
        return root;
    }
  
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        n=inorder.length;
        for(int i=0;i<n;i++){
            map.put(inorder[i],i); //store element and index;
        }

       return solve(preorder,0,n-1);
    }
}