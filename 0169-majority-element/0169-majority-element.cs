public class Solution {
    public int MajorityElement(int[] nums) {
        Dictionary<int,int> d1=new Dictionary<int, int>();
int n = nums.Length;
for(int i=0;i<n; i++) {
    if (d1.ContainsKey(nums[i]))
    {
        d1[nums[i]]++;
    }
    else
    {
        d1[nums[i]] = 1;
    }
}

foreach(KeyValuePair<int,int> entry in d1)
{
    if (entry.Value > n / 2)
    {
        return entry.Key;
    }
}
return -1;
    }
}