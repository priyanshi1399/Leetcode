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
    int count=0;
    public void backtrack(TreeNode root,long [] sum, HashMap<Long,Integer> map,int targetSum){
        if(root==null){
            return;
        }
        sum[0]+=root.val;
        if(map.containsKey(sum[0]-targetSum)){
            count+=map.get(sum[0]-targetSum);
        }

        map.put(sum[0],map.getOrDefault(sum[0],0)+1);
        backtrack(root.left,sum,map,targetSum);
        backtrack(root.right,sum,map,targetSum);
        map.put(sum[0],map.get(sum[0])-1);
        if(map.get(sum[0])==0){
            map.remove(sum[0]);
        }
        sum[0]-=root.val;
      
    }
    public int pathSum(TreeNode root, int targetSum) {
        if(root==null){
            return 0;
        }


        HashMap<Long,Integer> sumMap=new HashMap<>();
        sumMap.put(0L,1);
        long [] sum={0};
        backtrack(root,sum,sumMap,targetSum);
        return count;
    }
}