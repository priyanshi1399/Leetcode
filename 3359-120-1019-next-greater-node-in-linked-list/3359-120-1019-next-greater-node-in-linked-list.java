/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public int[] nextLargerNodes(ListNode head) {
        ListNode temp=head;
        List<Integer> lst=new ArrayList<>();
        while(temp!=null){
            lst.add(temp.val);
             temp=temp.next;
        }

        int [] res=new int[lst.size()];
        Stack<Integer> stck=new Stack<>();
        for(int i=0;i<lst.size();i++){
            while(!stck.isEmpty() && lst.get(stck.peek())<lst.get(i)){
                res[stck.pop()]=lst.get(i);
            }

            stck.push(i);
        }
        return res;
    }
}