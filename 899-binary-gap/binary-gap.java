class Solution {
    public int binaryGap(int n) {
        String binary=Integer.toBinaryString(n);
        System.out.println(binary);
        int len=binary.length();
        int countOne=0;
        int maxDist=0;
        int j=0;
        int prevIndex=0;
        for(int i=0;i<len;i++){
            char ch=binary.charAt(i);
            if(ch=='1'){
                prevIndex=j;
                j=i;
                countOne++;
            }
            if(countOne<=3){
                maxDist=Math.max(maxDist,j-prevIndex);
                countOne=0;
            }
            
        }
        return maxDist;
    }
}