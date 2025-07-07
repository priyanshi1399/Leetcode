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
        if(head==null  || k==0){
            return head;
        }
        
        ListNode temp=head;
        int size=1;
        while(temp.next!=null){
            size++;
            temp=temp.next;
        }
        k=k%size;
        if(k==0){
            return head;
        }
        temp.next=head;
        ListNode fast=head;
        for(int i=1;i<size-k;i++){
            fast=fast.next;
        }

        ListNode res=fast.next;
        fast.next=null;
        return res;

    }
}