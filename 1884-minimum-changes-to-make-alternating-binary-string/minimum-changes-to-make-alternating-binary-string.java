class Solution {
    public int checkMinimum(String s,char lastChar){
        int n=s.length();
        int count=0;
        for(int i=0;i<n;i++){
            char ch=s.charAt(i);
            if(lastChar=='0' && ch!='1'){
                count++;
                lastChar='1';
            }
            else if(lastChar=='1' && ch!='0'){
                count++;
                lastChar='0';
            }
            else{
                lastChar=ch;
            }
        }
        return count;
    }
    public int minOperations(String s) {
        int ans=Math.min(checkMinimum(s,'0'),checkMinimum(s,'1'));
        return ans;
        
    }
}