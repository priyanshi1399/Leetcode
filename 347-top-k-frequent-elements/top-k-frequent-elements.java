class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        int n=nums.length;
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<n;i++){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }
        //there can be max of elements will be nums.length any number can come maximum of length times

        List<Integer>[] bucket=new List[n+1]; //max of nums.length elements
        //inside this Listof Arrays we will have arrayList bcz there can be maore element which can have same frequency
        for(int i=0;i<n+1;i++){
            bucket[i]=new ArrayList<>();
        }

        //preparing one bucket with freq as the index and value as the key
        for(Map.Entry<Integer,Integer> entry:map.entrySet()){
            int freq=entry.getValue();
            int number=entry.getKey();

            bucket[freq].add(number); //like 1 ,2 --> 2 times then at index 2 {1,2}

        }

        List<Integer> res=new ArrayList<>();
        for(int i=n ;i>=0 && res.size()<k;i--){ //it will fill k elements from last we can take inner loop also
            if(!bucket[i].isEmpty()){
                res.addAll(bucket[i]);
            }
        }

        int [] answer=new int[k];
        for(int i=0;i<k;i++){
            answer[i]=res.get(i);
        }
        return answer;
    
    }
}