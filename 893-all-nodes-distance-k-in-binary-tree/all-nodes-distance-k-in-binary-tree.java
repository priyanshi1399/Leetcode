/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    public void convertToGraph(TreeNode curr,int parent,Map<Integer,List<Integer>> map){
        if(curr==null){
            return ;
        }
        if(parent!=-1){
            map.computeIfAbsent(curr.val,k->new ArrayList<>()).add(parent);
        }
        if(curr.left!=null){
            map.computeIfAbsent(curr.val,k->new ArrayList<>()).add(curr.left.val); //[3-->1] ,[5-->6]
        }
        if(curr.right!=null){
            map.computeIfAbsent(curr.val,k->new ArrayList<>()).add(curr.right.val);  //[3->1,5].[5->6,2]
        }
        convertToGraph(curr.left,curr.val,map); //[5-->3] [6-->5]
        convertToGraph(curr.right,curr.val,map);
    }
    public List<Integer> distanceK(TreeNode root, TreeNode target, int k) {
        HashMap<Integer,List<Integer>> map=new HashMap<>();
        convertToGraph(root,-1,map);
        Queue<Integer> q=new LinkedList<>();
        List<Integer> res=new ArrayList<>();
        HashSet<Integer> visited=new HashSet<>();
        int level=0;
        q.add(target.val);
        visited.add(target.val);
        while(!q.isEmpty()){
             if(k==0){
                break; //whye here needed why not below there where k-- written  if in starting k==0;
            }
            int n=q.size();
            while(n-->0){
                int curr=q.poll();
                for(int neighbour:map.getOrDefault(curr,Collections.emptyList())){
                    if(!visited.contains(neighbour)){
                        q.add(neighbour);
                        visited.add(neighbour);
                    }
                }
            }
            k--;
        }
        
        while(!q.isEmpty()){
            res.add(q.peek());
            q.poll();
        }
        return res;

    }
}