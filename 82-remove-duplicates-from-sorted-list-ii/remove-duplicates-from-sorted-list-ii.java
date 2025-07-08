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
    public ListNode deleteDuplicates(ListNode head) {
        if(head==null || head.next==null){
            return head;
        }
        ListNode dummy=new ListNode(-1);
        ListNode prev=dummy;
        prev.next=head;
        ListNode temp=head;
        while(temp!=null && temp.next!=null){
            if(temp.val==temp.next.val){
                while(temp.next!=null && temp.val==temp.next.val){
                    temp=temp.next;
                }
                if(prev!=null){
                    temp=temp.next;
                    prev.next=temp;
                }
                else{
                    prev=temp;
                }

            }
            else{
                prev=temp;
                temp=temp.next;
            }
        }
        return dummy.next;

    }
}