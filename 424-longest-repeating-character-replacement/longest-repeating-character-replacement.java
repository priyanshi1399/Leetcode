class Solution {
    public int characterReplacement(String s, int k) {
        int n=s.length();
        int maxLength=0;
        int [] hashArray=new int[26];
        int maxFreq=0;
        int i=0;
        for(int j=0;j<n;j++){
                hashArray[s.charAt(j)-'A']++;
                maxFreq=Math.max(maxFreq,hashArray[s.charAt(j)-'A']);
                while((j-i+1)-maxFreq>k){
                    hashArray[s.charAt(i)-'A']--;
                    maxFreq=0;
                    for(int index=0;index<26;index++){
                    maxFreq=Math.max(maxFreq,hashArray[index]);
                    }
                    i++;
                }
                if((j-i+1)-maxFreq<=k){
                    maxLength=Math.max(maxLength,j-i+1);
                }
            }
        return maxLength;
    }
}