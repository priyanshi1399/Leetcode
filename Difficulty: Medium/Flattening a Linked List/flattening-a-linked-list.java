class Solution {
    // Function to flatten a linked list
    Node flatten(Node head) {
      if(head==null || head.next==null){
          return head;
      }
      
      Node mergeHead=flatten(head.next);
      return merge(head,mergeHead);
        
    }
    
    public Node merge(Node list1, Node list2){
        Node dummy=new Node(-1);
        Node res=dummy;
        
        while(list1!=null && list2!=null){
            if(list1.data<list2.data){
                res.bottom=list1;
                res=list1; //res=res.bottom
                list1=list1.bottom;
            }
            else{
                res.bottom=list2;
                res=list2; //res=res.bottom
                list2=list2.bottom;
            }
            res.next=null;
        }
        if(list1==null){
            res.bottom=list2;
        }
        if(list2==null){
            res.bottom=list1;
        }
       
        return dummy.bottom;
    }
}