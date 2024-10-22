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
        
    }
}