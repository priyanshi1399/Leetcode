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
    public List<List<Integer>> verticalTraversal(TreeNode root) {
        List<List<Integer>> result=new ArrayList<>();
        Queue<Tuple> q=new LinkedList<>();
        q.add(new Tuple(root,0,0));
        TreeMap<Integer,TreeMap<Integer,PriorityQueue<Integer>>>  map=new TreeMap<>();
        while(!q.isEmpty()){
            Tuple tuple=q.poll();
            TreeNode node=tuple.node;
            int x=tuple.x;
            int y=tuple.y;
           map.putIfAbsent(x,new TreeMap<>());
           map.get(x).putIfAbsent(y,new PriorityQueue<>());
           map.get(x).get(y).add(node.val);

            if(node.left!=null){
                q.add(new Tuple(node.left,x-1,y+1));
            }

            if(node.right!=null){
                q.add(new Tuple(node.right,x+1,y+1));
            }
        }
        for(TreeMap<Integer,PriorityQueue<Integer>> yMap: map.values()){
            List<Integer> temp=new ArrayList<>();
            for(PriorityQueue<Integer> nodes: yMap.values()){
                while(!nodes.isEmpty()){
                    temp.add(nodes.poll());
                }
            }
            result.add(temp);
        }
        return result;
    }

    public class Tuple{
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
}