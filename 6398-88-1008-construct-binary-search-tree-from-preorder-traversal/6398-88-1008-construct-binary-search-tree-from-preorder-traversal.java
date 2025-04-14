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
    public TreeNode solve(List<Integer> preOrderList, int bound,int [] idx){
        if(idx[0]>=preOrderList.size() || preOrderList.get(idx[0])>bound){
            return null;
        }
        TreeNode root=new TreeNode(preOrderList.get(idx[0]++));
        root.left=solve(preOrderList,root.val,idx);
        root.right=solve(preOrderList,bound,idx);
        return root;
    }
    public TreeNode bstFromPreorder(int[] preorder) {
        int [] idx={0};
        ArrayList<Integer> preOrderList=new ArrayList<>();
        for(int val:preorder){
            preOrderList.add(val);
        }
        return solve(preOrderList,Integer.MAX_VALUE,idx);
    }
}