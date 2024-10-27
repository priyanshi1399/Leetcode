class Solution {
    public int countDigitForSepearation(int n){
        int count=0;
        while(n>0){
            n=n/10;
            count++;
        }
    return count;
    }

     public List<Integer> digitsSepeartion(int n,List<Integer> res,int c){
    if(c>1){
        String s=Integer.toString(n);
        for(int i=0;i<s.length();i++){
            res.add((int)(s.charAt(i)-'0'));
        }
    }
    else{
        res.add(n);
        }
     return res;
     }

    public int[] separateDigits(int[] nums) {
        List<Integer> lst=new ArrayList<Integer>();
        for(int i=0;i<nums.length;i++){
            int k=countDigitForSepearation(nums[i]);
           List<Integer> ans= digitsSepeartion(nums[i],lst,k);
        }
        int [] ans=new int[lst.size()];
        for(int i=0;i<ans.length;i++){
            ans[i]=lst.get(i);
        }
     return ans;
}
}