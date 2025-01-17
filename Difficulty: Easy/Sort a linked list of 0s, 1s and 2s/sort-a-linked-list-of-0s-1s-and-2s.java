//{ Driver Code Starts
import java.io.*;
import java.util.*;

class Node {
    int data;
    Node next;

    Node(int x) {
        data = x;
        next = null;
    }
}


// } Driver Code Ends
// User function Template for Java

/*
class Node
{
    int data;
    Node next;
    Node(int data)
    {
        this.data = data;
        next = null;
    }
}
*/
class Solution {
    
     static void swap(int x,int y,int [] arr){
        int temp=arr[x];
        arr[x]=arr[y];
        arr[y]=temp;
    }
    // Function to sort a linked list of 0s, 1s and 2s.
    static Node segregate(Node head) {
        List<Integer> res=new ArrayList<>();
        Node temp=head;
        while(temp!=null){
            res.add(temp.data);
            temp=temp.next;
        }
        
         int [] arr=new int[res.size()];
         for(int i=0;i<arr.length;i++){
             arr[i]=res.get(i);
         }
        
        int low=0;
        int mid=0;
        int high=arr.length-1;
        
        while(mid<=high){
            if(arr[mid]==0){
                swap(low,mid,arr);
                low++;
                mid++;
            }
            else if(arr[mid]==1){
                mid++;
            }
            else{
                swap(mid,high,arr);
                high--;
            }
        }
        
       
        temp=head;
        for(int i=0;i<arr.length;i++){
            temp.data=arr[i];
            temp=temp.next;
        }
        
        return head;
        
    }
}


//{ Driver Code Starts.

class GFG {
    public static void printList(Node node) {
        while (node != null) {
            System.out.print(node.data + " ");
            node = node.next;
        }
        System.out.println();
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim());

        while (t-- > 0) {
            List<Integer> arr = new ArrayList<>();
            String input = br.readLine().trim();
            StringTokenizer st = new StringTokenizer(input);
            while (st.hasMoreTokens()) {
                arr.add(Integer.parseInt(st.nextToken()));
            }

            Node head = null;
            if (!arr.isEmpty()) {
                head = new Node(arr.get(0));
                Node tail = head;
                for (int i = 1; i < arr.size(); i++) {
                    tail.next = new Node(arr.get(i));
                    tail = tail.next;
                }
            }
            head = new Solution().segregate(head);
            printList(head);
        }
    }
}
// } Driver Code Ends