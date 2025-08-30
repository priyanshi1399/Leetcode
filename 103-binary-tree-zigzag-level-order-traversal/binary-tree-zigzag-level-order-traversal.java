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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> res=new ArrayList<>();
        if(root==null){
            return res;
        }
        Queue<TreeNode> q=new LinkedList<>();
        q.add(root);
        boolean flag=false;
        while(!q.isEmpty()){
            int n=q.size(); //n=1 ,n=2
            List<Integer> temp=new ArrayList<>(); //[]
            while(n>0){ //1>0 ,2>0 ,2>0
                TreeNode curr=q.poll(); //curr=3  curr=[9] curr=20 ,curr=15 ,curr=7
                temp.add(curr.val); //temp-[3] ,temp-[9,20], temp-[15,7]
                if(curr.left!=null){
                    q.add(curr.left); //1=[9]  q=[15]
                }
                if(curr.right!=null){
                    q.add(curr.right); //q=[9,20] q.size()=2; ,q=[15,7]
                }
                n--; //n=0 , n=1 n=0 ,n=1 n=0
            }
            if(flag){
                int len=temp.size();
                Integer [] arr=new Integer[len];
                int index=0;
                for(int i=len-1;i>=0;i--) {//[20,9]
                    arr[index++]=temp.get(i);
                }
                res.add(Arrays.asList(arr)); // will be added in reverse [20,9]
            }
            else{
                res.add(temp);// [[3], [15,7]]
            }
            flag=!flag; //false //true
            
            
        }
        return res;

    }
}