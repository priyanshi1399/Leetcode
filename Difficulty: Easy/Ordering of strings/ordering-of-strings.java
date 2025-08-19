// User function Template for Java

class Solution {
    String[] orderString(String s[], int n) {
        String min_String=s[0];
        String max_String=s[0];
        
        for(int i=1;i<n;i++){
            if(s[i].compareTo(min_String)<0){
                min_String=s[i];
            }
            
            if(s[i].compareTo(max_String)>0){
                max_String=s[i];
            }
        }
        
        return new String[]{min_String,max_String};
    }
}