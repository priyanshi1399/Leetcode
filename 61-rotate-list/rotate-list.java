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
    public ListNode rotateRight(ListNode head, int k) {
        if(head==null || head.next==null ||k==0){
            return head;
        }
        ListNode temp=head;
        ListNode prev=null;
        int size=0;
        while(temp!=null){
            size++;
            prev=temp;
            temp=temp.next;
            
        }
        
        if(k>0){
            prev.next=head;
            k=k%size;
            ListNode fast=head;
            for(int i=1;i<size-k;i++){
                fast=fast.next;
            }
            
            System.out.println(prev.val);
            ListNode result=fast.next;
            fast.next=null;
            return result;
        }
        return head;

    }
}