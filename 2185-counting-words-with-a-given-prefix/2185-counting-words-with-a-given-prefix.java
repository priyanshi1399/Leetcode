class Solution {
    public int prefixCount(String[] words, String pref) {
        int count=0;
        int k=pref.length();
        int n=words.length;
        for(int i=0;i<n;i++){
          //  System.out.println(words[i]);
          if(words[i].length()>=k){ //here it was failing for prefix-code and words[i]=win so not able to check next line
            if((words[i].substring(0,k)).equals(pref)){
                count++;
            }
          }
        }
        return count;
    }
}