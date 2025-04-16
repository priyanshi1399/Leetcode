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
    public int widthOfBinaryTree(TreeNode root) {
        Queue<Pair<TreeNode,Integer>> q=new LinkedList<>();
        int maxWidth=0;
        q.add(new Pair<>(root,0));
        while(!q.isEmpty()){
            int n=q.size();
            int minIndex=q.peek().getValue();
            int first=0,last=0;
            for(int i=0;i<n;i++){
                Pair<TreeNode,Integer> pair=q.poll();
                TreeNode node=pair.getKey();
                int idx=pair.getValue()-minIndex;
                if(i==0){
                    first=idx;
                }
                if(i==n-1){
                    last=idx;
                }
                if(node.left!=null){
                    q.add(new Pair<>(node.left,2*idx+1));
                }

                if(node.right!=null){
                    q.add(new Pair<>(node.right,2*idx+2));
                }
            }
        maxWidth=Math.max(maxWidth,last-first+1);
        }

            return maxWidth;
            
        }

    class Pair <K,V>{
        K key;
        V value;

        public Pair(K key,V value){
            this.key=key;
            this.value=value;
        }
        public K getKey(){
            return key;
        }
        public V getValue(){
            return value;
        }
    }
}