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
    HashMap<Long,Integer> map=new HashMap<>();
    
    private void solve(TreeNode root,int targetSum,int [] ans,long [] sum){
        if(root==null){
            return;
        }
        sum[0]+=root.val;
        if(map.containsKey(sum[0]-targetSum)){
                ans[0]+=map.get(sum[0]-targetSum);
               
        }
        System.out.println(sum[0]);
        map.put(sum[0],map.getOrDefault(sum[0],0)+1);
        solve(root.left,targetSum,ans,sum);
        solve(root.right,targetSum,ans,sum);
        map.put(sum[0],map.get(sum[0])-1);
        sum[0]-=root.val;
      

    }
    public int pathSum(TreeNode root, int targetSum) {
        int [] ans={0};
        long [] sum={0};
        map.put((long)0,1);
        solve(root,targetSum,ans,sum);
        return ans[0];
    }
}