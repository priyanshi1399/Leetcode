class Solution {
    public boolean isCircularSentence(String sentence) {

        int n=sentence.length();
        boolean flag=false;
         if(sentence.charAt(0)!=sentence.charAt(n-1)){
                    return false;
                }
        for(int i=1;i<n-1;i++){
            if(sentence.charAt(i)==' '){
                if(sentence.charAt(i-1)!=sentence.charAt(i+1)){
                    return false;
                }
            }
        }
        return true;

     /*   int n=sentence.length();
        boolean flag=false;

        int i=0;
        int j=-1;
        for(;i<n;i++){
        if(sentence.charAt(i)==' '){
        j=i;
            if(sentence.charAt(j-1)!=sentence.charAt(j+1)){
                return false;
            }
        }
        }
        if(sentence.charAt(0)==sentence.charAt(n-1)){
            flag=true;
        }

        return flag;*/
    }
}