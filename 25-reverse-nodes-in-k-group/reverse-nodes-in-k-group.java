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
        ListNode curr=head;
        int length=0;
        while(curr!=null){
            length++;
            curr=curr.next;
        }

        ListNode prev=dummy;
        while(length>=k){
            curr=prev.next;
            
            for(int i=1;i<=k-1;i++){  
                ListNode f=curr.next;            
                curr.next=f.next;
                f.next=prev.next;
                prev.next=f;
            }
            length=length-k;
            prev=curr;
        }
        return dummy.next;
        
    }
}