class Solution {
    public int subarraySum(int[] nums, int k) {
        Map<Integer,Integer> map =new HashMap<>();
        int ans=0;
        int sum=0;
        map.put(0,1);
        for(int i=0;i<nums.length;i++){
            sum=sum+nums[i];
            if(map.containsKey(sum-k)){
                ans=ans+map.get(sum-k);
            }
            map.put(sum,map.getOrDefault(sum,0)+1);
        }
        return ans;



        /*Map<Integer, Integer> map=new HashMap<>();
        map.put(0,1);
        int ans=0,sum=0;
        for(int i=0;i<nums.length;i++){
            sum=sum+nums[i];
            if(map.containsKey(sum-k)){
                ans=ans+map.get(sum-k); //adding value for exmapl e[9,3] then add 3              
            }
            map.put(sum,map.getOrDefault(sum,0)+1); //if value exists then increase by 1 otherwise put 0 increase by 1
        }
        return ans;*/
    }
}

/*
1,8,1,2,4,5,1
k=7
sum=0
map=[0,1]
sum=1
map=[0,1],[1,1]
sum=9
map=[0,1],[1,1],[9,1] check 0-7 exists in map no, does 1-7 exists in map no
does 9-7 exists in map no
sum=10
map=[0,1],[1,1],[9,1],[10,1] does 10-7 exists in map no
sum=12
map=[0,1],[1,1],[9,1],[10,1],[12,1] does 12-7 present in map no
sum=16
map=[0,1],[1,1],[9,1],[10,1],[12,1][16,1] does 16-7 present in map  yesss.
here 4,2,1 exists one subarray which has sum=9
and sum=16 , 1,8,1,2,4
then  1,2,4 definitely has to be 7.
sum-k+k=sum
*/


//2nd Example
/*
1,8,0,1,2,4,5,1
k=7
sum=0
map=[0,1]--why this?
sum=1 check 1-7 you have in map no
map=[0,1],[1,1]
sum=9  check 9-7 you have in map no
map=[0,1],[1,1],[9,1]
sum=9 again sum=9 then main change you will do count 
map=[0,1],[1,1],[9,2]
sum=10 check 10-7 exists no
map=[0,1],[1,1],[9,2],[10,1]
sum=12
map=[0,1],[1,1],[9,2],[10,1], [12,1]
sum=16 does 16-7 exists yes there are 2 subarrays that has sum as 9 1,2,4 and 8,1
map=[0,1],[1,1],[9,2],[10,1], [12,1], [16,1]
/*

1,3,3,0,1,2,4,5,1
k=7
sum=0
map=[0,1]
sum=1
map=[0,1],[1,1]
sum=4
map=[0,1],[1,1],[4,1]
sum=7 does 7-7 exists in map yess so empty subarray can be there to handle this case we need as map[0,1]
or take condition which has sum =7 that is equal to k then increase count by 1
map=[0,1],[1,1],[4,1],[7,1] 


.................
k=4
1,8,1,2,1,4
Index 1 sum=9
Index 1 sum=9 , so here there were 2 subarray suppose count will also matter
Index 4 sum=13
13-9=4 you have subarray where sum is 4
4-1=3 
1,8,1,2,1,4
*/