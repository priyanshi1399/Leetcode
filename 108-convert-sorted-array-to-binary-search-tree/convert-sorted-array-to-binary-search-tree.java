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
    public TreeNode createTree(int [] nums,int low,int high){
        if(low>high){
            return null;
        }
        int mid=low+(high-low)/2;
        TreeNode root=new TreeNode(nums[mid]);
        root.left=createTree(nums,low,mid-1);
        root.right=createTree(nums,mid+1,high);
        return root;

    }
    public TreeNode sortedArrayToBST(int[] nums) {
        int n=nums.length;
        if(n==0){
            return null;
        }
        return createTree(nums,0,n-1);
    }
}