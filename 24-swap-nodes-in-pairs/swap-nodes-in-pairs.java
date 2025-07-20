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
    public ListNode swapPairs(ListNode head) {
        if(head==null || head.next==null){
            return head;
        }

        ListNode dummy=new ListNode(0);
        ListNode prev=dummy;
        prev.next=head;

        ListNode curr=head;
        while(curr!=null && curr.next!=null){
            ListNode f=curr.next;
            curr.next=f.next;
            f.next=curr;
            prev.next=f;
            prev=curr;
            curr=curr.next;
        }
        return dummy.next;
    }
}

