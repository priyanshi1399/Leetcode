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
    public ListNode reverseBetween(ListNode head, int left, int right) {
        ListNode dummy=new ListNode(-1);
        ListNode prev=dummy;
        prev.next=head;

        for(int i=1;i<left;i++){
            prev=prev.next; //move previous first
        }
        ListNode curr=prev.next;
        for(int i=1;i<=right-left;i++){
            ListNode f=curr.next;
            curr.next=f.next;
            f.next=prev.next;
            prev.next=f;
        }
        return dummy.next;


    }
}