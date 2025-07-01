// User function Template for Java

class Solution {
     
public static boolean solve(int i,int N, int K, int [] arr){
      
        if(K==0){
            return true;
            
        }
        
        if(K<0 || i==N){
            return false;
        }
        
        return solve(i+1,N,K-arr[i],arr) || solve(i+1,N,K,arr);
}

    public static boolean checkSubsequenceSum(int N, int[] arr, int K) {
        
      return solve(0,N,K,arr);
        
    }
}
