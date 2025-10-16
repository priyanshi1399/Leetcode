class Solution {
    public boolean validateAll(int [] arr){
        for(int i=0;i<26;i++){
            if(arr[i]!=0){
               for(int j=i;j<26;j++){
                   if(arr[j]!=0 && arr[j]!=arr[i]){
                       return false;
                   }
           }
        }
            else{
                continue;
            }
        }
        return true;
    }
    public int longestBalanced(String s) {
        int n=s.length();
        int maxLength=0;
    for(int i=0;i<n;i++){
        int [] arr=new int[26];
        for(int j=i;j<n;j++){
            char ch=s.charAt(j);
            arr[ch-'a']++;
            if(validateAll(arr)){
                int length=j-i+1;
                maxLength=Math.max(maxLength,length);
            }
        }
    }
        return maxLength;
    }
}