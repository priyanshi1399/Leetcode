class Solution {
    public boolean isPrefixString(String s, String[] words) {
        StringBuilder s1=new StringBuilder();
        for(int i=0;i<words.length;i++){
            s1.append(words[i]);

            if(s.equals(s1.toString())){
                return true;
            }
        }
        return false;
    }
}