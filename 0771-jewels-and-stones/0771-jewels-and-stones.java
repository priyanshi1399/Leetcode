class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        int count=0;
        /*for(int i=0;i<stones.length();i++){ //i==0
           for(int j=0;j<jewels.length();j++){ //j==0
            if(stones.charAt(i)==jewels.charAt(j)){
                count++; //count=1 a,A
            }
           }
        }
        return count; */

        for(int i=0;i<stones.length();i++){
            if(jewels.contains(String.valueOf(stones.charAt(i)))){ //here contains ethod expecting a char sequence
            //like string so we have to give String.valueOf to give argument as String
                count++;
            }
        }
        return count; 
    }
}