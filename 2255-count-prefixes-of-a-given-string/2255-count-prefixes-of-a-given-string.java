class Solution {
    public int countPrefixes(String[] words, String s) {
        int count=0;
        int n=words.length;
        for(int i=0;i<n;i++){
            if(s.length()>=words[i].length()){
            if(s.substring(0,words[i].length()).equals(words[i])){
                count++;
            }
        }
        }
        return count;
    }
}