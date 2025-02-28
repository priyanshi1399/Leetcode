//{ Driver Code Starts
import java.io.*;
import java.util.*;

class Geeks {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine()); // Number of test cases
        for (int g = 0; g < t; g++) {
            String[] str =
                (br.readLine()).trim().split(" "); // Reading input as a string array
            int arr[] = new int[str.length]; // Creating integer array from the input
            for (int i = 0; i < str.length; i++) {
                arr[i] = Integer.parseInt(str[i]);
            }

            // Getting the result from the Solution class
            ArrayList<Integer> result = new Solution().subsetSums(arr);
            Collections.sort(result);
            // Printing the result in space-separated format
            for (int i = 0; i < result.size(); i++) {
                if (i != 0) System.out.print(" ");
                System.out.print(result.get(i));
            }
            System.out.println();    // Print new line after each test case
            System.out.println("~"); // Print new line after each test case
        }
    }
}

// } Driver Code Ends


// User function Template for Java//User function Template for Java
class Solution {
    public  void solve(int index,int [] arr, int sum,ArrayList<Integer> res, int n){
        if(index==n){
            res.add(sum);
            return;
        }
        
        
        sum=sum+arr[index];
        solve(index+1,arr,sum,res,n);
        sum=sum-arr[index];
        solve(index+1,arr,sum,res,n);
    }
    public ArrayList<Integer> subsetSums(int[] arr) {
        int n=arr.length;
        int sum=0;
        ArrayList<Integer> res=new ArrayList<>();
        solve(0,arr,0,res,n);
        return res;
    }
}