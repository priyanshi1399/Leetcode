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
    public TreeNode solve(int [] preorder,int [] inorder, int start,int end){
        if(start>end){
            return null;
        }
        int i=0;
        for(int index=0;index<n;index++){
            if(inorder[index]==preorder[idx]){
                i=index;
                break;
            }
        }
        TreeNode root=new TreeNode(preorder[idx]); //making root from preorder index wise
        idx++;
        root.left=solve(preorder,inorder,start,i-1);
        root.right=solve(preorder,inorder,i+1,end);
        return root;

    }
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        
        n=preorder.length;
        return solve(preorder,inorder,0,n-1);
    }
}