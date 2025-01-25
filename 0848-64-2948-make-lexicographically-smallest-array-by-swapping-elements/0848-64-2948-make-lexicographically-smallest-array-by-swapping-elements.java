class Solution {
    public int[] lexicographicallySmallestArray(int[] nums, int limit) {
        int [] arr=new int[nums.length];
        for(int i=0;i<nums.length;i++){
            arr[i]=nums[i];
        }

        Arrays.sort(arr);

        Map<Integer,Integer> numToGroup=new HashMap<>();
        Map<Integer,LinkedList<Integer>> groupToList=new HashMap<>();

        int groupNum=0;
        numToGroup.put(arr[0],groupNum);
        groupToList.putIfAbsent(groupNum,new LinkedList<Integer>());
        groupToList.get(groupNum).add(arr[0]);

        for(int i=1;i<arr.length;i++){
            if(Math.abs(arr[i]-arr[i-1])>limit){
                groupNum++;
            }
            numToGroup.put(arr[i],groupNum);
            groupToList.putIfAbsent(groupNum,new LinkedList<Integer>());
            groupToList.get(groupNum).add(arr[i]);
        }


        int [] ans=new int[arr.length];
        for(int i=0;i<arr.length;i++){
            int num=nums[i];
            int group=numToGroup.get(num); //it will give values like 0 and 1..
            ans[i]=groupToList.get(group).pollFirst();

        }

        return ans;
       
    }
}