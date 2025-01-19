class Solution {
    public int[] decode(int[] encoded, int first) {
        int n=encoded.length;
        int [] decodeArray=new int[n+1];
        int len=decodeArray.length;
        decodeArray[0]=first;
        for(int i=1;i<len;i++){
            decodeArray[i]=decodeArray[i-1]^encoded[i-1];
        }
        return decodeArray;
    }
}