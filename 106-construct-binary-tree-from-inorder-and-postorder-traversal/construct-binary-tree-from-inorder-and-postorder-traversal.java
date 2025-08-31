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
    public TreeNode solve(int [] inorder, int [] postorder, int inStart, int inEnd,int postStart,int postEnd,HashMap<Integer,Integer> map){

        if(inStart>inEnd){
            return null;
        }

        TreeNode root=new TreeNode(postorder[postEnd]);
        int i=map.get(root.val);

        int leftSize=i-inStart; //tells how many element on left size
        int rightSize=inEnd-i; //tells how many element on right side

        root.left=solve(inorder,postorder,inStart,i-1,postStart, postStart+leftSize-1,map);
        root.right=solve(inorder,postorder,i+1,inEnd,postEnd-rightSize, postEnd-1,map);
        return root;

    }
    public TreeNode buildTree(int[] inorder, int[] postorder) {
        HashMap<Integer,Integer> map=new HashMap<>();
       
        int n=inorder.length;
        for(int i=0;i<n;i++){
            map.put(inorder[i],i);
        }
        int inStart=0;
        int inEnd=n-1;

        int postStart=0;
        int postEnd=n-1;

        return solve(inorder,postorder, inStart,inEnd,postStart,postEnd,map);

    }
}