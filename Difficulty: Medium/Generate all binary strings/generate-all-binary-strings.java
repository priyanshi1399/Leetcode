//{ Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.lang.*;
import java.math.*;
import java.io.*;

class GFG {
  public static void main(String[] args) throws IOException {
    Scanner sc = new Scanner(System.in);
    int T = sc.nextInt();
    while (T-- > 0) {
      int n = sc.nextInt();
      Solution obj = new Solution();
      List<String> ans = obj.generateBinaryStrings(n);
      for(String s : ans) System.out.print(s+" ");
      System.out.println();
    
System.out.println("~");
}
  }
}

// } Driver Code Ends


//User function Template for Java


class Solution {

   public static void solve(List<String> result , StringBuilder curr, int n,int index){
       if(index==n){
           result.add(curr.toString());
           return;
       }
     
      
       curr.append('0');
       solve(result,curr,n,index+1);
       curr.deleteCharAt(curr.length()-1);
        
    if(curr.length()>=1 &&curr.charAt(curr.length()-1)!='1' || curr.length()==0){
        curr.append('1');
        solve(result,curr,n,index+1);
       curr.deleteCharAt(curr.length()-1);
    }    
        
    
      
   }     
  public static List<String> generateBinaryStrings(int n) {
    List<String> result=new ArrayList<>();
    StringBuilder curr=new StringBuilder();
    solve(result,curr,n,0);
    return result;
  }
}
     
     