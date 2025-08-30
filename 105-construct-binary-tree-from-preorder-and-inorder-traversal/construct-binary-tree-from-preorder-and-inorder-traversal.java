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
    int idx=0;
    int n;
    HashMap<Integer,Integer> map=new HashMap<>();
    public TreeNode solve(int [] preorder, int start,int end){
        if(start>end){
            return null;
        }
        int i=map.get(preorder[idx]); //getting index
        TreeNode root=new TreeNode(preorder[idx]); //making root from preorder index wise
        idx++;
        root.left=solve(preorder,start,i-1);
        root.right=solve(preorder,i+1,end);
        return root;

    }
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        
        n=preorder.length;
        for(int i=0;i<n;i++){
            map.put(inorder[i],i);
        }
        return solve(preorder,0,n-1);
    }
}