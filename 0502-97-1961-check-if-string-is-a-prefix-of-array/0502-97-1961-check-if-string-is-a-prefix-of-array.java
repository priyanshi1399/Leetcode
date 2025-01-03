class Solution {
    public boolean isPrefixString(String s, String[] words) {
        StringBuilder str=new StringBuilder();
        for(int i=0;i<words.length;i++){
            str.append(words[i]);
                if(s.equals(str.toString())){
                    return true;
                }
            }
    
        return false;

        /*int n=s.length();
        int w=words.length;
        String str="";
        for(int i=0;i<w;i++){
            str=str+words[i];
            if(str.equals(s)){
                return true;
            }
            else{
                continue;
            }
        }
        return false;*/
    }
}