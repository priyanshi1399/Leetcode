class Solution {
    public String mergeAlternately(String word1, String word2) {
        String s="";
        int i=0;
        int j=0;
        while(i<word1.length()&& j<word2.length()){
            s=s+word1.charAt(i)+word2.charAt(j);
            i++;
            j++;
        }
        if(word1.length()<word2.length()){
            for(int k=j;k<word2.length();k++){
                s=s+word2.charAt(k);
            }
        }
        else{
            for(int k=i;k<word1.length();k++){
                s=s+word1.charAt(k);
            }
        }
        return s;
        }

    }
