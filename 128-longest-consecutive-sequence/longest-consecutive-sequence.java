class Solution {
    public int longestConsecutive(int[] nums) {
        int n=nums.length;
        HashMap<Integer,Integer> map=new HashMap<>();
        int maxLength=0;
        for(int i=0;i<n;i++){
            int x=nums[i];
            if(!map.containsKey(x)){
                int left=map.getOrDefault(x-1,0);
                int right=map.getOrDefault(x+1,0);

                int len=1+left+right; //for forming a subsequence
                map.put(x,len);
                map.put(x-left,len);
                map.put(x+right,len);
                maxLength=Math.max(maxLength,len);
            }
        }
        return maxLength;
    }
}