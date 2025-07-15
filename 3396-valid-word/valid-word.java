class Solution {
    public int checkVowel(char ch){
        int countVowel=0;
         if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u' || ch=='A' || ch=='E' || ch=='I' || ch=='O' || ch=='U'){
                countVowel++;
            }
            return countVowel;
        }
    

    public int checkCons(char ch){
        int countConst=0;
         if(ch!='a'&& ch!='e' && ch!='i' && ch!='o' && ch!='u' && ch!='A' && ch!='E' && ch!='I' &&ch!='O'  && ch!='U'){
                countConst++;
            }
            return countConst;
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
                continue;
            }
            else{
             countVowel+=checkVowel(ch);
             countCons+=checkCons(ch);

        } 
        }
        System.out.println(countVowel);
        System.out.println(countCons);


    
    if(countVowel<1 || countCons<1){
        return false;
    }
    return true;
    }
    
}