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
    public TreeNode makeNode(TreeNode root,int start){
        if(root==null){
            return null;
        }
        if(root.val==start){
            return root;
        }
        TreeNode left=makeNode(root.left,start);
        if(left!=null){
                return left;
        }
        return makeNode(root.right,start);
    }
    public void convertToGraph(TreeNode curr,int parent,Map<Integer,List<Integer>> parentMap){
        if(curr==null){
            return ;
        }

        if(parent!=-1){
            parentMap.computeIfAbsent(curr.val,k->new ArrayList<>()).add(parent);
        }
        if(curr.left!=null){
            parentMap.computeIfAbsent(curr.val,k->new ArrayList<>()).add(curr.left.val);
        }
         if(curr.right!=null){
            parentMap.computeIfAbsent(curr.val,k->new ArrayList<>()).add(curr.right.val);
        }

        convertToGraph(curr.left,curr.val,parentMap);
        convertToGraph(curr.right,curr.val,parentMap);

    }
    public int amountOfTime(TreeNode root, int start) {
        HashMap<Integer,List<Integer>> parentMap=new HashMap<>();
        convertToGraph(root,-1,parentMap);
        TreeNode startNode=makeNode(root,start);
        Queue<Integer> q=new LinkedList<>();
        HashSet<Integer> set=new HashSet<>();

        q.add(start);
        set.add(start);
        int minute=0;
        while(!q.isEmpty()){
            int n=q.size();
            while(n-->0){
                int curr=q.poll();
                for(int neighbour:parentMap.getOrDefault(curr,Collections.emptyList())){
                    if(!set.contains(neighbour)){
                        q.add(neighbour);
                        set.add(neighbour);
                    }
                }
            }
            minute++;
        }
        return minute-1;

    }
}