class Solution {
    public boolean canConstruct(String s, int k) {
        if(s.length()<k){
            return false;
        }
        if(s.length()==k){
            return true;
        }
        int [] countArray=new int[26];
        for(int i=0;i<s.length();i++){
            countArray[s.charAt(i)-'a']++;
        }   
        int count=0; 
        for(int i=0;i<countArray.length;i++){
            if(countArray[i]%2!=0){
                count++;
            }
        }
        return count<=k;
        }
    
}