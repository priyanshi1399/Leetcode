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
       
        ListNode dummy=new ListNode(-1);
        ListNode prev=dummy;
        prev.next=head;
        int count=0;
        ListNode curr=head;
        while(curr!=null){
            count++;
            curr=curr.next;
        } //count=5
        curr=head;
        while(count>=k){ //5-2=3-2=1 left
            curr=prev.next;
            for(int i=1;i<=k-1;i++){
                ListNode f=curr.next;
                curr.next=f.next;
                f.next=prev.next;
                prev.next=f;
            }
            count=count-k;
            prev=curr;
        }
        return dummy.next;
    }
}