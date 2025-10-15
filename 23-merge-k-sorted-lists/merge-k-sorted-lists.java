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
    public ListNode mergeKLists(ListNode[] lists) {
        if(lists.length==0 || lists==null){
            return null;
        }
        PriorityQueue<ListNode> pq=new PriorityQueue<>(lists.length,(a,b)->Integer.compare(a.val,b.val));
        for(ListNode node:lists){
            if(node!=null){
                pq.add(node);
            }
        }

        ListNode res=new ListNode(-1);
        ListNode temp=res;
        while(!pq.isEmpty()){
            temp.next=pq.poll();
            temp=temp.next;
            if(temp.next!=null){
                pq.add(temp.next);
            }
        }
        return res.next;


    }
}