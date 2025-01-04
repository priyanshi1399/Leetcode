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
        ListNode dummy=new ListNode(0);
        dummy.next=head; //[5] dummy=null-->5
        ListNode prev=dummy; //prev=null return dummy .next;

        for(int i=1;i<=left-1;i++){
            prev=prev.next;
        }

        ListNode curr=prev.next;
        for(int i=0;i<right-left;i++){
            ListNode f=curr.next;
            curr.next=f.next;
            f.next=prev.next;
            prev.next=f;
        }
        return dummy.next;
    }
}