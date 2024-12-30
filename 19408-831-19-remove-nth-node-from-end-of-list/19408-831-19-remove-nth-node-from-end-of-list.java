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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode fast=head;
        ListNode slow=head;
        for(int i=0;i<n;i++){
            fast=fast.next;
        }
        while(fast!=null && fast.next!=null){
            fast=fast.next;
            slow=slow.next;

        }
        if(fast==null){
            return head.next;
        }
        slow.next=slow.next.next;
        return head;
    }
}

/*Brute Force
class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if(head==null){
            return null;
        }
        int length=0;
        ListNode temp=head;
        while(temp!=null){
            length++;
            temp=temp.next;
        }

        int cnt=0;
        temp=head;
        // while(temp!=null && length==1 && n==1){
        //     return null;
        // } //this I put for [1] X=1 so it will be handled inside other loop below
        while(temp!=null){
            cnt++;
            if(length-n==0){
                return head.next;
            }
            else if(cnt==length-n){
                temp.next=temp.next.next;
            }
            else{
                temp=temp.next;
            }
        }
        return head;
    }
}


*/