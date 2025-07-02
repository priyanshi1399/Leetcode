class Solution {
    public int possibleStringCount(String word) {
        int n=word.length();
        int i=0;
        int count=1;
        while(i<n){
            if(i+1<n && word.charAt(i)==word.charAt(i+1)){
                count++;
            }
            i++;
        }
        return count;
    }
}