public class Solution {
    public void SortColors(int[] nums) {
        int n=nums.Length;
        int k=0;
        Dictionary<int,int> dict=new Dictionary<int,int>();
        for(int i=0;i<n;i++){
            if(!dict.ContainsKey(nums[i])){
                dict.Add(nums[i],1);
            }
            else{
                dict[nums[i]]++;
            }
        }
        var myList=dict.OrderBy(x=>x.Key).ToList();
        int [] res=new int[n];
        foreach(var item in myList){
            for(int i=0;i<item.Value;i++){
                res[k]=item.Key;
                k++;
            }
        }
        for(int j=0;j<res.Length;j++){
            nums[j]=res[j];
        }
        
    }
}

