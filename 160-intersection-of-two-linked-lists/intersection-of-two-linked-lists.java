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
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        int size1=0;
        int size2=0;
        ListNode curr1=headA;  
        while(curr1!=null){
            size1++;
            curr1=curr1.next;
        }
        ListNode curr2=headB;
         while(curr2!=null){
            size2++;
            curr2=curr2.next;
        }
        curr1=headA;
        curr2=headB;
        int nodeToSkip=Math.abs(size1-size2);
        if(size1>size2){
            
            for(int i=1;i<=nodeToSkip;i++){
                curr1=curr1.next; //same level
            }
            
            while(curr1!=curr2){
                curr1=curr1.next;
                curr2=curr2.next;
            }
            if(curr1!=null && curr2!=null){
                return curr1;
            }
            return null;
        }

        else if(size1==size2){
             while(curr1!=curr2){
                curr1=curr1.next;
                curr2=curr2.next;
            }
            if(curr1!=null && curr2!=null){
                return curr1;
            }
            return null;

        }
        else{
           
            for(int i=1;i<=nodeToSkip;i++){
                curr2=curr2.next; //same level
            }
            
            while(curr1!=curr2){
                curr1=curr1.next;
                curr2=curr2.next;
            }
            if(curr1!=null && curr2!=null){
                return curr1;
            }
            return null;
        }



    }
}