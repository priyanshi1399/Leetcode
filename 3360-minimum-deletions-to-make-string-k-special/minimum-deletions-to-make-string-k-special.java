class Solution {
    public int minimumDeletions(String word, int k) {
        int n=word.length();
        int [] freq=new int[26];
        for(int i=0;i<n;i++){
            char ch=word.charAt(i);
            freq[ch-'a']++;
        }
        int result=Integer.MAX_VALUE;
        for(int i=0;i<26;i++){
            int deletion=0;
            for(int j=0;j<26;j++){
                if(i==j){
                    continue; //same frequency already <=k
                }
                else if(freq[j]<freq[i]){
                    deletion+=freq[j]; //delete that small character  as remains aaaa
                }
                else if(Math.abs(freq[j]-freq[i])>k){
                    deletion+=Math.abs(freq[j]-freq[i])-k; //deletion
                }

            }
            result=Math.min(result,deletion);
        }
        return result;
    }
}