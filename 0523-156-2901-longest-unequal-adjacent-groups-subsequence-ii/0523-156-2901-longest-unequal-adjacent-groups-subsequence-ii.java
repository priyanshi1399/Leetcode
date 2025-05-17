class Solution {
    public boolean hamming(String s1,String s2){
        int hammingDist=0;
        for(int i=0;i<s1.length();i++){
            char ch1=s1.charAt(i);
            char ch2=s2.charAt(i);
            if(ch1!=ch2){
                hammingDist++;
            }
        }  
       
        return hammingDist==1;
       
    }
    public List<String> getWordsInLongestSubsequence(String[] words, int[] groups) {
        int n=words.length;
        int [] prevIndex=new int[n];
        Arrays.fill(prevIndex,-1);
        int [] dp=new int [n];
        Arrays.fill(dp,1);
        int LIS=1;
        int LISIndex=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<i;j++){
                if(words[j].length()==words[i].length() && groups[i]!=groups[j] && hamming(words[i],words[j])){
                    if(dp[j]+1>dp[i]){
                        dp[i]=dp[j]+1;
                        prevIndex[i]=j;
                        if(LIS<dp[i]){
                        LIS=dp[i];
                        LISIndex=i;
                        
                    }
                }
            }
        }
    }

        List<String> res=new ArrayList<>();
        while(LISIndex!=-1){
            res.add(words[LISIndex]);
            LISIndex=prevIndex[LISIndex];
        }
        Collections.reverse(res);
        return res;
    }
}