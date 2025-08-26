class Solution {
    public int minimumSum(int num) {
        int n=num;
        int [] ans=new int[4];
        int i=0;
        while(n>0){
            int rem=n%10;
            n=n/10;
            ans[i]=rem;
            i++;
        }
        Arrays.sort(ans);
        return ans[0]*10+ans[2]+ans[1]*10+ans[3];
        

    }
}