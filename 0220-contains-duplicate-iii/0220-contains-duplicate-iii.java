class Solution {

    public boolean containsNearbyAlmostDuplicate(int[] nums, int indexDiff, int valueDiff) {
        if(valueDiff==0){
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int j=0;j<nums.length;j++){
            if(map.containsKey(nums[j])){
               if(Math.abs(map.get(nums[j])-j)<=indexDiff){
                return true;
               }
            }
            map.put(nums[j],j);
        }
        return false;
        }

        int i=indexDiff;
        int n=nums.length;
        boolean flag=false;
        for(int k=1;k<=i;k++){
           flag=check(nums,valueDiff,k);
           if(flag==true){
            return true;
           }
        }
        return false;
    }

    public boolean check(int [] nums, int valueDiff,int k){
        int i=0;
        int j=k;
        int n=nums.length;
        while(j<n){
            if(Math.abs(nums[i]-nums[j])<=valueDiff){
                return true;
            }
        i++;
        j++;
        }
        return false;
    }
}
