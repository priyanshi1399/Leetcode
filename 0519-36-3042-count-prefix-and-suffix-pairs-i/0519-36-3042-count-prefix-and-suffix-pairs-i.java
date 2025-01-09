class Solution {

    public boolean isSuffixAndPrefix(String str1,String str2){
        int length1=str1.length();
        int length2=str2.length();
        if((str2.substring(0,length1).equals(str1)) && (str2.substring(length2-length1,length2).equals(str1))){
            return true;
        }
        return false;
    }

    public int countPrefixSuffixPairs(String[] words) {
        int n=words.length;
        int count=0;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(words[i].length()<=words[j].length()){
                if(isSuffixAndPrefix(words[i],words[j])){
                    count++;
                }
                }
            }
        }
        return count;
    }
}