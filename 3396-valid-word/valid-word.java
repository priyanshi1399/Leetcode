class Solution {
  
        
    public boolean checkVowel(char ch){
        if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u' || ch=='A' || ch=='E' || ch=='I' || ch=='O' || ch=='U'){
               return true;
        }
            return false;
    }

    public boolean isValid(String word) {
        int n=word.length();
        if(n<3 || word.contains("@") || word.contains("$") || word.contains("#")){
            return false;
        }
        int countVowel=0;
        int countCons=0;

        for(int i=0;i<n;i++){
            char ch=word.charAt(i);
            if(Character.isDigit(ch)){
                continue; //it will pass that character
            }
            if(checkVowel(ch)){
                countVowel++; //if vowel wlse const bcz didits I already passsed
            }
            else{
                countCons++;
            }
            if(countVowel>=1 && countCons>=1){
                return true; //early return
            }
        } 
        
        return false;
    }
}   