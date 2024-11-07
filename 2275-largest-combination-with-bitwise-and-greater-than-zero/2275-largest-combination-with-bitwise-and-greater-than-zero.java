class Solution {
    public int largestCombination(int[] candidates) {
        int result=Integer.MIN_VALUE;
        for(int i=0;i<24;i++){ //why taking 24 10^7 so log2 10^7 =log 10^7 base 10 * log 2(10)=check bit 23.25+1=24
            int count_ithpos=0;
            for(int j=0;j<candidates.length;j++){
            if((candidates[j] & (1<<i))!=0) {//doing left shift of 1 at ith position and then doing and with number 
            //tells if at the ith position bit is set bit or not.
            count_ithpos++;
        }
    }
    result=Math.max(result,count_ithpos);
        
    }
    return result;
}
}