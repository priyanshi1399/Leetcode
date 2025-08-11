class Solution {
    public boolean canPlaceCows(int [] stalls,int dist,int k){
        int cntCows=1; //take already 1 bcz 2 cows should be there
        int last=stalls[0];
        
        for(int i=1;i<stalls.length;i++){
            if(stalls[i]-last>=dist){
                cntCows++;
                last=stalls[i];
            }
            if(cntCows>=k){ //these many cows can be placed
                return true;
            }
        }
        return false;
    }
    public int aggressiveCows(int[] stalls, int k) {
        int n=stalls.length;
        Arrays.sort(stalls);
        int maxVal=stalls[n-1]-stalls[0];
        for(int i=1;i<=maxVal;i++){
            if(canPlaceCows(stalls,i,k)==true){
                continue; //check for others bcz we want maximum possible
            }
            else{
                return i-1; //previous value;
            }
        }
        return maxVal;
    
    }
}