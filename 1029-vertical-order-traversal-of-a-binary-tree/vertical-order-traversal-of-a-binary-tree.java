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
    class Tuple{
        TreeNode node;
        int x;
        int y;

        public Tuple(TreeNode node){
            this.node=node;
        }

        public Tuple(TreeNode node,int x,int y){
            this.node=node;
            this.x=x;
            this.y=y;
        }

      
    }
    public List<List<Integer>> verticalTraversal(TreeNode root) {
        List<List<Integer>> res=new ArrayList<>();
        TreeMap<Integer,TreeMap<Integer,PriorityQueue<Integer>>> map=new TreeMap<>();
        Queue<Tuple> q=new LinkedList<>();
        if(root==null){
            return res;
        } 
        q.add(new Tuple(root,0,0));
        while(!q.isEmpty()){
            int n=q.size();
            while(n-->0){
                Tuple tuple=q.poll();
                TreeNode curr=tuple.node;
                int vertical=tuple.x;
                int level=tuple.y;
                map.putIfAbsent(level,new TreeMap<>());
                map.get(level).putIfAbsent(vertical,new PriorityQueue<>()); //it will give me answer in sorted order
                map.get(level).get(vertical).add(curr.val);
                if(curr.left!=null){
                    q.add(new Tuple(curr.left,vertical+1,level-1));
                }
                if(curr.right!=null){
                    q.add(new Tuple(curr.right,vertical+1,level+1));
                }
            }
        }
        for(TreeMap<Integer,PriorityQueue<Integer>> yMap: map.values()){
            List<Integer> column =new ArrayList<>();
            for(PriorityQueue<Integer> nodes:yMap.values()){
                while(!nodes.isEmpty()){
                    column.add(nodes.poll());
                }
                 
            }
            res.add(column);
           
        }
        return res;
    }
}