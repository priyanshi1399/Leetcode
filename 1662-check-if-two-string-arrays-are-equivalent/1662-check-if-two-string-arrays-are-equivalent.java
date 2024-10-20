class Solution {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        StringBuilder s1=new StringBuilder();
        StringBuilder s2=new StringBuilder();
        /*for(int i=0;i<word1.length;i++){
            s1.append(word1[i]);
        }*/
        for(String s: word1){
            s1.append(s); //o(word1.length)=>0(x)
        }
        for(String s: word2){
            s2.append(s); //0(y)
        }
        if(s1.toString().equals(s2.toString())){
            return true;
        }
        else{
            return false;
        }
        //"hgfdee"
        //"jhggfrttt" 0(min(x,y)) because it checks till x1 mataches
        //.equals checks true if the content

        //SC: 0(x+y), x number of characters in word1  and y is number of character in word2
        //T(C): 0(x+y) ->bigger terms
}
}