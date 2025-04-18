class Solution {
    public int hIndex(int[] citations) {
        int n=citations.length;
        int [] freq=new int[n+1];
        for(int i=0;i<n;i++){
            if(citations[i]>=n){
                freq[n]++;
            }
            else{
                freq[citations[i]]++;
            }
        }
        int idx=freq.length-1;
        int count=freq[freq.length-1];
        while(count<idx){
            idx--;
            count+=freq[idx];
        }
        return idx;
    }
}