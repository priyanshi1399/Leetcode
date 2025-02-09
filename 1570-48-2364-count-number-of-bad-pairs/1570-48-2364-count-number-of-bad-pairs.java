class Solution {
    public long countBadPairs(int[] nums) {
        int n=nums.length;
        for(int i=0;i<n;i++){
            nums[i]=nums[i]-i;
        }

        HashMap<Integer,Integer> map=new HashMap<>();
        long badPair=0;
        long result=0;
        for(int j=0;j<n;j++){
            long goodPair=0;
            long totalPairs=j;
            if(map.containsKey(nums[j])){
                goodPair=map.get(nums[j]);
            }
            map.put(nums[j],map.getOrDefault(nums[j],0)+1);
            badPair=totalPairs-goodPair;
            result+=badPair;
        }
        return result;

    }
}
    /*public long countBadPairs(int[] nums) {
        int  n=nums.length;
        for(int i=0;i<n;i++){
            nums[i]=nums[i]-i;
        }

        HashMap<Integer,Integer> seen =new HashMap<>();

        long badPair=0;
        long numberBeforeJ=0;
        long result=0;
        for(int j=0;j<n;j++){
            long goodPair=0;
            if(seen.containsKey(nums[j])){
                goodPair=seen.get(nums[j]);
            }
            badPair=(numberBeforeJ-goodPair);
            seen.put(nums[j],seen.getOrDefault(nums[j],0)+1);
            numberBeforeJ++; //how many number is in the left of j
            result+=badPair;
        }
        return result;
    }
}*/