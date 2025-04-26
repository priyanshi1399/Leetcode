class Solution {
    public long countInterestingSubarrays(List<Integer> nums, int m, int k) {
        int n=nums.size();
        int [] cumSum=new int[n];
        for(int i=0;i<n;i++){
            if(nums.get(i)%m==k){
                cumSum[i]=1;
            }
        }
        int size=cumSum.length;
        HashMap<Integer,Long> map=new HashMap<>();
        long count=0;
        int sum=0;
        map.put(0,1L);
        for(int i=0;i<size;i++){
            sum+=cumSum[i];
            int r1=sum%m;
            int r2=(r1-k+m)%m;
            if(map.containsKey(r2)){
                count+=map.get(r2);
            }
            map.put(r1,map.getOrDefault(r1,0L)+1);
        }

    return count;
        
    }
}