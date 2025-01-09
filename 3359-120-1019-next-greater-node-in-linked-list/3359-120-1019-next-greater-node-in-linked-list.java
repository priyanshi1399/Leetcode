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

     public int[] nextLargerNodes(ListNode head) {
        ListNode temp=head;
        List<Integer> res=new ArrayList<>();
        while(temp!=null){
            ListNode search=temp.next;
            int value=searchNextElement(search,temp.val);
            if(value==temp.val){
                res.add(0);
            }
            else{
                res.add(value);
            }
            temp=temp.next;
        }
        int [] ans=new int[res.size()];
        for(int i=0;i<ans.length;i++){
            ans[i]=res.get(i);
        }
        return ans;
     }


     public int searchNextElement(ListNode head, int maxValue){
        ListNode temp=head;
        while(temp!=null){
            if(temp.val>maxValue){
                maxValue=temp.val;
                break;
            }
            temp=temp.next;
        }
        return maxValue;
     }
}
   /* public int[] nextLargerNodes(ListNode head) {
        ListNode temp=head;
        List<Integer> lst=new ArrayList<>();
        while(temp!=null){
            lst.add(temp.val);
             temp=temp.next;
        }

        int [] res=new int[lst.size()];
        Stack<Integer> stck=new Stack<>();
        for(int i=0;i<lst.size();i++){
            while(!stck.isEmpty() && lst.get(stck.peek())<lst.get(i)){
                res[stck.pop()]=lst.get(i);
            }

            stck.push(i);
        }
        return res;
    }
}*/