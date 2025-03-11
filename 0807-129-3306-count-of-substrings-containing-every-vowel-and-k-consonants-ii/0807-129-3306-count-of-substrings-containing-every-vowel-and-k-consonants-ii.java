class Solution {
    private boolean isVowel(char ch){
        if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u'){
               return true;
            }
            return false;
    }
    public long countOfSubstrings(String word, int k) {
        int n=word.length();
        HashMap<Character,Integer> map=new HashMap<>();
        //preprocessing of nextConsonants
        int [] nextConst=new int[n];
        int lastConsIdx=n;
        for(int i=n-1;i>=0;i--){
            nextConst[i]=lastConsIdx;
            if(!isVowel(word.charAt(i))){
                lastConsIdx=i;
            }
        }
        int i=0;
        int j=0;
        long result=0;
        int countCons=0;
        while(j<n){
            char ch=word.charAt(j);
            if(isVowel(ch)){
                map.put(ch,map.getOrDefault(ch,0)+1);
            }
            else{
                countCons++;
            }

             while(map.size()==5  &&countCons>k){
                char ith_char=word.charAt(i);
                    if(map.containsKey(ith_char)){
                        map.put(ith_char,map.get(ith_char)-1);
                            if(map.get(ith_char)==0){
                                map.remove(ith_char);
                            }
                    }
                    else{
                        countCons--;
                    }
                    i++;                  
                }

                while(map.size()==5 && countCons==k){
                    int idx=nextConst[j]; //where next Vowel will be found
                    result+=idx-j; //where j stands and next vowel so that it breaks on it /substring calculated
                     char ith_char=word.charAt(i);
                    if(map.containsKey(ith_char)){
                        map.put(ith_char,map.get(ith_char)-1);
                            if(map.get(ith_char)==0){
                                map.remove(ith_char);
                            }
                    }
                    else{
                        countCons--;
                    }
                    i++;                  
                }
            j++;
        }
        return result;
    }
}