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
    public  ListNode collission(ListNode curr1,ListNode curr2, int diff){
        for(int i=1;i<=diff;i++){
            curr1=curr1.next;
        }

        while(curr1!=curr2){
            curr1=curr1.next;
            curr2=curr2.next;
        }
        return curr1; //either return curr1 or curr2;
    }
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode curr=headA;
        int size1=0;
        while(curr!=null){
            size1++;
            curr=curr.next;
        }

        curr=headB;
        int size2=0;
        while(curr!=null){
            size2++;
            curr=curr.next;
        }

        ListNode curr1=headA;
        ListNode curr2=headB;
        int diff=Math.abs(size1-size2);
        if(size1>=size2){
            return collission(curr1,curr2,diff);
        }
        return  collission(curr2,curr1,diff);
       
    }
}