class Solution {
    public String reversePrefix(String word, char ch) {
        char [] charArray=word.toCharArray();
        StringBuilder part=new StringBuilder();
        int n=charArray.length;
        String result="";
        for(int i=0;i<n;i++){
            if(charArray[i]==ch){
                String s1=word.substring(0,i+1);
                part.append(s1);
                part.reverse();
                String s2=word.substring(i+1,n);
                result=part.toString()+s2;
                break;
            }           
        }
        if(result==""){
        return word;
        }
        else{
            return result;
        }     
    }
}