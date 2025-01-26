//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t;
        t = Integer.parseInt(br.readLine());
        while (t-- > 0) {

            int a;
            a = Integer.parseInt(br.readLine());

            int b;
            b = Integer.parseInt(br.readLine());

            Solution obj = new Solution();
            int[] ans = obj.lcmAndGcd(a, b);
            System.out.println(ans[0] + " " + ans[1]);
            System.out.println("~");
        }
    }
}


// } Driver Code Ends

// User function Template for Java

class Solution {
    public static int[] lcmAndGcd(int a, int b) {
       
       int [] LcmGcd=new int[2];
       int LCM=lcm(a,b);
       int GCD=gcd(a,b);
       
       LcmGcd[0]=LCM;
        LcmGcd[1]=GCD;
        return LcmGcd;
       
    }
    
    private static int lcm(int a,int b){
        int gcdOfNum=gcd(a,b);
        int lcm=a*b/gcdOfNum;
        return lcm;
    }
    
     private static int gcd(int a,int b){
      while(a!=0 && b!=0){
          if(a>b){
              a=a%b;
          }
          else{
              b=b%a;
          }
      }
      
      if(a==0){
          return b;
      }
      else{
          return a;
      }
    }
}

//{ Driver Code Starts.

// } Driver Code Ends