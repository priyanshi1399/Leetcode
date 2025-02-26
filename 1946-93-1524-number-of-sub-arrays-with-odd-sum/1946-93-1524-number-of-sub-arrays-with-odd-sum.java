class Solution {
    private final int mod=1000000007;
     public int numOfSubarrays(int[] arr) {
        int n=arr.length;
        int sum=0;
        int evenArrays=1; //why 1 becausewe start from 0 anbd 0 is even
        int oddArrays=0;
        int ans=0;
        for(int i=0;i<n;i++){
            sum=sum+arr[i];
            if(sum%2==0){
                ans=(ans+oddArrays)%mod;
                evenArrays++;
            }
            else{
                ans=(ans+evenArrays)%mod;
                oddArrays++;

            }
        }
        return ans;
    }
}
    /*public int numOfSubarrays(int[] arr) {
        int n=arr.length;
        int [] prefixSum=new int[n];
        prefixSum[0]=arr[0];
        for(int i=1;i<n;i++){
            prefixSum[i]=prefixSum[i-1]+arr[i];
        }
        int evenArrays=1; //why 1 becausewe start from 0 anbd 0 is even
        int oddArrays=0;
        int ans=0;
        for(int i=0;i<prefixSum.length;i++){
            if(prefixSum[i]%2==0){
                ans=(ans+oddArrays)%mod;
                evenArrays++;
            }
            else{
                ans=(ans+evenArrays)%mod;
                oddArrays++;

            }
        }
        return ans;
    }
}*/