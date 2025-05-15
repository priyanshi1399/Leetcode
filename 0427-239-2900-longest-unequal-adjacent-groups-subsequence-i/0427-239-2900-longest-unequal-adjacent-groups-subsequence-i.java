class Solution {
    public List<String> getLongestSubsequence(String[] words, int[] groups) {
        int n=words.length;
        List<String> res=new ArrayList<>();
        for(int i=0;i<n;i++){
            if(i==0 || groups[i-1]!=groups[i]){
                res.add(words[i]);
            }
        }
        return res;
    }
}