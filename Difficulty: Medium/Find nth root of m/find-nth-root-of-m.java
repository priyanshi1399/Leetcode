class Solution {
    public long func(int a,int b){
        if(b==0){
            return 1;
        }
        
        long half=func(a,b/2);
        long result=half*half;
        if(b%2==1){
            result=a*result;
        }
        return result;
    }
    public int nthRoot(int n, int m) {
        for(int i=1;i<=m;i++){
            long val=func(i,n);
            if(val==(long)(m)){
                return i;
            }
            else if(val>(long)(m)){
                break;
            }
        }
        return -1;
        
    }
}