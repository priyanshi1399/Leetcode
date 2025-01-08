//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            String s, patt;
            s = sc.next();
            patt = sc.next();

            Solution ob = new Solution();

            ArrayList<Integer> res = ob.search(patt, s);
            if (res.size() == 0)
                System.out.print("[]");
            else {
                for (int i = 0; i < res.size(); i++) System.out.print(res.get(i) + " ");
            }
            System.out.println();
        }
    }
}
// } Driver Code Ends


// User function Template for Java

class Solution {
    
    public void computeLPS(String pattern, int [] LPS, int m){
        int len =0; //length of longest prefix and suffix which were equal
        int i=1;
        while(i<m){
            if(pattern.charAt(i)==pattern.charAt(len)){
                len++;
                LPS[i]=len;
                i++;
            
            }
            else
            {
                if(len!=0){
                len=LPS[len-1];
                }
                else{
                    LPS[i]=0;
                    i++;
                }
            }
        }
        
    }

    ArrayList<Integer> search(String pat, String txt) {
        int m=pat.length();
        int n=txt.length();
        ArrayList<Integer> result =new ArrayList<>();
        int [] LPS=new int [m];
        
        computeLPS(pat,LPS,m);
        int i=0;
        int j=0;
        while(i<n){
            if(j<m && txt.charAt(i)==pat.charAt(j)){
                i++;
                j++;
            }
            
            if(j==m){
                result.add(i-m); //0-based indexing
                 j=LPS[j-1];
            }
            else if(i<n&& txt.charAt(i)!=pat.charAt(j)){
                if(j!=0){
                j=LPS[j-1];
            }
            else{
                i++; //in this case only i++;
            }
        }
    }
    return result;
}
}