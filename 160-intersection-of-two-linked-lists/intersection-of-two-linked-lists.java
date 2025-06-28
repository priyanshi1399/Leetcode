/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode collission(ListNode t1,ListNode t2,int diff){
        for(int i=1;i<=diff;i++){
            t1=t1.next;
        }

        while(t1!=t2){
            t1=t1.next;
            t2=t2.next;
        }
        return t1;
    }
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        int size1=0;
        ListNode curr=headA;
        while(curr!=null){
            size1++;
            curr=curr.next;
        }

        int size2=0;
        curr=headB;
        while(curr!=null){
            size2++;
            curr=curr.next;
        }
        int diff=Math.abs(size1-size2);
        ListNode t1=headA;
        ListNode t2=headB;
        if(size1>size2){ //size of 1st is greater
            return collission(t1,t2,diff);
        }
        else{
            return collission(t2,t1,diff);
        }
        
    }
}