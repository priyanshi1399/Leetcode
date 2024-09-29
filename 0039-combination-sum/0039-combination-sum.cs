public class Solution {
   
    public static void findcombination(int ind, int[] arr,int target,IList<IList<int>> ans, List<int> ds)
{
    if (ind == arr.Length)
    {
        if (target==0)
        {
            ans.Add(new List<int>(ds));
        }
        return;
    }
    if (arr[ind] <= target)
    {
        ds.Add(arr[ind]);
        findcombination(ind, arr, target - arr[ind], ans, ds);
        ds.RemoveAt(ds.Count() - 1);
    }
    findcombination(ind+1,arr,target,ans,ds);
    
}
 public IList<IList<int>> CombinationSum(int[] candidates, int target) {
        IList<IList<int>> ans = new List<IList<int>>();
        List<int> ds=new List<int>();
        findcombination(0, candidates, target,ans,ds);
        return ans;
        
    }
    
}