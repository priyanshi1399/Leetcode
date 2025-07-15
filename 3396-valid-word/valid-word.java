class Solution {
    public boolean isValid(String word) {
        int n=word.length();
        if(n<3){
            return false;
        }
        boolean isVowel=false;
        boolean isCons=false;
        for(int i=0;i<n;i++){
            char ch=word.charAt(i);
            if(Character.isLetter(ch)){
                ch=Character.toLowerCase(ch);
                if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u' ){
                   isVowel=true;
                }
                else{
                    isCons=true;
                }
            }
            else if(!(Character.isDigit(ch))){
                return false;
            }
        }
        
        return (isVowel) && (isCons);
    }
}