class Solution {

    public boolean bSearch(List<Integer> arr, int statringPoint, int endingPoint){
        int l=0;
        int r=arr.size()-1;
        while(l<=r){
            int mid=l+(r-l)/2;
            if(arr.get(mid)<statringPoint){ //smaller in range
                l=mid+1;
            }

            else if(arr.get(mid)>endingPoint){ //out of range
                r=mid-1;
            }

            else{
                return true; //found violatingIndex
            }
        }
        return false;
    }

    public boolean[] isArraySpecial(int[] nums, int[][] queries) {
        int m=queries.length;
        int n=nums.length;

        List<Integer> violatingIndex=new ArrayList<>();
        for(int i=1;i<n;i++){
            if(nums[i]%2==nums[i-1]%2){ //if same parity is there violatingindex
                violatingIndex.add(i);
            }
        }

       boolean [] result=new boolean[m];
        for(int i=0;i<m;i++){
            int start=queries[i][0];
            int end=queries[i][1];

           boolean hasViolatingIndexInRange =bSearch(violatingIndex,start+1,end);
            if(!hasViolatingIndexInRange){
                result[i]=true;
            }
            else{
                result[i]=false;
            }

        }

        return result; //O(n + m*logn)


        /*int m=queries.length;
        int n=nums.length;

        int [] validIndexAfterPoint= new int [n];
        int i=0;
        int j=0;
        while(i<n){
            if(j<i){
                j=i;
            }

            while(j+1<n && nums[j]%2!=nums[j+1]%2){
                j++;
            }
            validIndexAfterPoint[i]=j;
            i++;
        }

        boolean [] res=new boolean[m];
        for(i=0;i<m;i++){
            int start=queries[i][0];
            int end=queries[i][1];

            if(validIndexAfterPoint[start]>=end){
                res[i]=true;
            }
            else{
                res[i]=false;
            }
        }
    
     return res;   */

        /*int [] cumulativeSum=new int [nums.length];
        int n=nums.length;
        int m=queries.length;

        for(int i=1;i<n;i++){
            if((nums[i]%2==0)  && (nums[i-1]%2==0)){ // violating index;
                cumulativeSum[i]=cumulativeSum[i-1]+1;
            }
            else if((nums[i]%2!=0)  && (nums[i-1]%2!=0)){ //  can be written as nums[i]%2==nums[i-1]%2
                cumulativeSum[i]=cumulativeSum[i-1]+1;
            }
            else{
                cumulativeSum[i]=cumulativeSum[i-1];
            }

        }

        boolean [] result=new boolean[m];
        for(int i=0;i<m;i++){
            int start=queries[i][0];
            int end=queries[i][1];

             if(cumulativeSum[end]-cumulativeSum[start]==0){
                result[i]=true;
             }
             else{
                result[i]=false;
             }
        }
        return result;*/
    }
}