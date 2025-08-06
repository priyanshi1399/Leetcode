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
       
        ListNode res=new ListNode(-1);
        ListNode tail=res;
        for(ListNode node:lists){
            if(node!=null){
                pq.add(node); //keep adding in priorityQueue
            }
        }
            while(!pq.isEmpty()){
                tail.next=pq.poll(); //adding node to pointer
                tail=tail.next;
            if(tail.next!=null){
                pq.add(tail.next); //adding next node of this tail
            }
            
            }
        return res.next;
    }
}