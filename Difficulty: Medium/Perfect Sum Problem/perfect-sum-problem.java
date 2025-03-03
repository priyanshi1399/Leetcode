//{ Driver Code Starts
import java.io.*;
import java.util.*;

class Main {
    public static void main(String args[]) throws IOException {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine().trim()); // Read number of test cases

        // Loop for each test case
        while (t-- > 0) {
            String line = read.readLine().trim(); // Read the array input
            String[] numsStr = line.split(" ");   // Split the input string by spaces
            int[] nums =
                new int[numsStr.length]; // Convert string array to integer array
            for (int i = 0; i < numsStr.length; i++) {
                nums[i] = Integer.parseInt(numsStr[i]);
            }

            int target = Integer.parseInt(read.readLine().trim()); // Read target sum

            Solution ob = new Solution(); // Create an object of Solution class
            System.out.println(
                ob.perfectSum(nums, target)); // Call perfectSum and print the result
            System.out.println("~");          // Call perfectSum and print the result
        }
    }
}
// } Driver Code Ends




class Solution {
    
    
    public int solve(int index,int [] nums,int target,int n,int [][] dp){
       if(index>=n){
           if(target==0){
               return 1;
           }
           else{
               return 0;
           }
       }
       if(target<0){
           return 0;
       }
       if(dp[index][target]!=-1){
           return dp[index][target];
       }
       
       int path1=solve(index+1,nums,target-nums[index],n,dp);
       
       int path2=solve(index+1,nums,target,n,dp);    
        
        return dp[index][target]= path1+path2;
        
    }
    // Function to calculate the number of subsets with a given sum
    public int perfectSum(int[] nums, int target) {
        int n=nums.length;
        int [][] dp=new int[n][target+1];
        for(int [] row:dp){
            Arrays.fill(row,-1);
        }

        int count=solve(0,nums,target,n,dp);
        return count;
        
    }
}