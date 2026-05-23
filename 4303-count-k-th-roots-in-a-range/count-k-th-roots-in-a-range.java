class Solution {
    public int countKthRoots(int l, int r, int k) {
        int count=0;
        if(k==1) return r-l+1;
        for(int i=0;i<=r/2;i++){
            long pow=1;
            for(int j=0;j<k;j++){
                pow*=i;
            }
            if(pow>r){
                break;
            }
            if(pow>=l && pow<=r){
                count++;
            }
        }
        return count;
    }
}