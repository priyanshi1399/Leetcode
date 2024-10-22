class Solution {
    public String reversePrefix(String word, char ch) {
        int pos=-1;
        int n=word.length();
        for(int i=0;i<n;i++){
            if(word.charAt(i)==ch){
                pos=i;
                break;
            }
        }

        if(pos==-1){
            return word; //if not found
        }
        int i=0;
        int j=pos;
        char [] chars=word.toCharArray();
        while(i<=j){
            char temp=chars[i];
            chars[i]=chars[j];
            chars[j]=temp;
            i++;
            j--;
        }
       return new String(chars); 


       /*
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
       */
        
    }
}