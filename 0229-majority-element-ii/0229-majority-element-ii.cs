public class Solution {
    public IList<int> MajorityElement(int[] nums) {
        List<int> lst=new List<int>();
        Dictionary<int,int> dict=new Dictionary<int,int>();
        int n=nums.Length;
        for(int i=0;i<n;i++){
            if(!dict.ContainsKey(nums[i])){
                dict.Add(nums[i],1);
            }
            else{
                dict[nums[i]]++;
            }
        }
        int mini=(n/3)+1;

        foreach(KeyValuePair<int,int> entry in dict){
            if(entry.Value>=mini){
                lst.Add(entry.Key);
            }
        }
        return lst;
    }
}