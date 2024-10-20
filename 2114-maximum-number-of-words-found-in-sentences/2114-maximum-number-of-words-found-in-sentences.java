class Solution {
    public int mostWordsFound(String[] sentences) {
        int ans=0;
        for(int i=0;i<sentences.length;i++){
            //String [] arr=sentences[i].split(" ");
            ans=Math.max(ans,sentences[i].split(" ").length);
        }
        return ans;
    }
}
//Split takes like 0(number of characters in String)
//not storing it anywhere: but it will have memory: o(total number of characters)