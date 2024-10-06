class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        int count=0;
        for(int i=0;i<stones.length();i++){ //i==0
           for(int j=0;j<jewels.length();j++){ //j==0
            if(stones.charAt(i)==jewels.charAt(j)){
                count++; //count=1 a,A
            }
           }
        }
        return count;
    }
}