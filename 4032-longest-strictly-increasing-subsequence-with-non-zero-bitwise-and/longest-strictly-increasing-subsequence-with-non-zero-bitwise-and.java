class Solution {
    public int longestSubsequence(int[] nums) {
        int maxValue=0;
        for(int bit=0;bit<32;bit++){

            List<Integer> arr=new ArrayList<>();
            for(int num:nums){

                if((num & (1<<bit))==0){
                    continue; //if set bit 0 continue
                }

                else if(arr.isEmpty() || num>arr.get(arr.size()-1)){
                    arr.add(num);
                }
                else{
                    int idx=lowerBound(arr,num);
                    arr.set(idx,num);
                    } //checking right value where to place
                
            }
            maxValue=Math.max(maxValue,arr.size());
        }
        return maxValue;
    }

    public int lowerBound(List<Integer> arr,int num){
        int l=0;
        int h=arr.size()-1;

        while(l<=h){
            int mid=l+(h-l)/2;
            if(arr.get(mid)>=num){
                h=mid-1;
            }
            else{
                l=mid+1;
            }
        }
        return l;
    }
}