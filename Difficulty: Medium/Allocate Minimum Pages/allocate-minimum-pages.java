class Solution {
    public boolean isValidBookAllocation(int [] arr, int mid,int k){
        int sum=0;
        int student=1;
        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
            if(sum>mid){
                student++; //increase student give it to another
                sum=arr[i]; // current book given to this student
            }
            if(student>k){
                return false;
            }
        }
        return true;
    }
    public int findPages(int[] arr, int k) {
        int low=Arrays.stream(arr).max().getAsInt(); // maximum no of page atleast given to one student
        int high=Arrays.stream(arr).sum();//maximum given to other
        if(arr.length<k){
            return -1; //not suffiecient books
        }
        int result=-1;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(isValidBookAllocation(arr,mid,k)){
                    result=mid;
                    high=mid-1;
            }
            else{
                low=mid+1;
            }
        }
        return result;
        
    }
}