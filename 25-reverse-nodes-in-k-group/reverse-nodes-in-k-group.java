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
    public ListNode reverseKGroup(ListNode head, int k) {
        ListNode dummy=new ListNode(0);
        dummy.next=head;
        ListNode prev=dummy;

        int size=0;
        ListNode curr=head;
        while(curr!=null){
            size++;
            curr=curr.next;
        }
        System.out.println(size);
        curr=head;
        while(size>=k){
            curr=prev.next;
            for(int i=1;i<=k-1;i++){
                ListNode f=curr.next;
                curr.next=f.next;
                f.next=prev.next;
                prev.next=f;
            }
            prev=curr;
            size=size-k;
        }
        return dummy.next;
}
}