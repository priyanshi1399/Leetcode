class Solution {
    public int minimumRecolors(String blocks, int k) {
        int start=0;
        int count=0;
        for(int i=0;i<k;i++){
            if(blocks.charAt(i)=='W'){
                count++;
            }
        }
        int res=count;
        for(int i=k;i<blocks.length();i++){
            if(blocks.charAt(i)=='W'){
                count++;
            }
            if(blocks.charAt(start)=='W'){
                count--;
            }
            start++;
            res=Math.min(res,count);
        }
        return res;
    }
}