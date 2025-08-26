// User function Template for Java

class Solution {
    public boolean checkAllZeroes(int [] AllCharacter){
    for(int i=0;i<26;i++){
        if(AllCharacter[i]!=0){
            return false;
        }
        
    }
        return true;
    
    }
    

    int search(String pat, String txt) {
        int [] allCharacter=new int[26];
        int k=pat.length();
        int count=0;
        for(int i=0;i<k;i++){
            allCharacter[pat.charAt(i)-'a']++; //fill pat letters
            
        }
        int n=txt.length();
        int j=0;
        int i=0;
        while(j<n){
            
            char ch=txt.charAt(j);
            allCharacter[ch-'a']--;
            
            while(j-i+1==k){
                if(checkAllZeroes(allCharacter)){
                    count++; //adding if found anagram
                }
                allCharacter[txt.charAt(i)-'a']++; //adding to window while shrinking
                i++;
            }
            j++;
            
        }
        return count;
        
         
    }
}