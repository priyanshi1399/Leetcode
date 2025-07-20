class Solution {
    public int[] topKFrequent(int[] nums, int k) {
       int n=nums.length;
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<n;i++){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }

        List<Integer>[] bucket=new List[nums.length+1];
        for(int i=0;i<n+1;i++){
            bucket[i]=new ArrayList<>();
        }

        for(Map.Entry<Integer,Integer> entry:map.entrySet()){
            int key=entry.getKey();
            int freq=entry.getValue();

            bucket[freq].add(key);
        }

        //teher can be more than 2 elements whose frequency can be same or maximum 
        //example 1,2-->2 times {1,2} on 2
        List<Integer> ans=new ArrayList<>();
        for(int i=bucket.length-1;i>=0 && ans.size()<k;i--){ //why result.size<k those many elements will come
            if(bucket[i]!=null){
                ans.addAll(bucket[i]);
            }
        }

        int[] result = new int[ans.size()];
        for (int i = 0; i < ans.size(); i++) {
            result[i] = ans.get(i);
        }
        return result;


        
    }
}