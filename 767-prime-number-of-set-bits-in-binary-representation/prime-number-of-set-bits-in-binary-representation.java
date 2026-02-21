class Solution {
    public int countPrimeSetBits(int left, int right) {
        //Since 10^6 equivalent to 2^20 bits
        //we need just 20 bits maximum

        HashSet<Integer> set=new HashSet<>(Arrays.asList(2,3,5,7,11,13,17,19));
        int count=0;
        for(int i=left;i<=right;i++){
            int bitCount=Integer.bitCount(i);
            if(set.contains(bitCount)){
                count++;
            }
        }
        return count;
    }
}