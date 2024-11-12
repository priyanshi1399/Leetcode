class Solution {
    public char nextGreatestLetter(char[] letters, char target) {
        int i=0;
        for(;i<letters.length;i++){
            if(letters[i]>target){
                return letters[i];
            }
        }
        return letters[0];
        
        /*int n=letters.length;
        int l=0;
        int h=n;
        while(l<h){
            int mid=l+(h-l)/2;
            if(letters[mid]<=target){
                l=mid+1;
            }
            else{
                h=mid;
            }
        }
        int upperBound=l;
       if(upperBound-1>0 && letters[upperBound-1]==target){
        return letters[upperBound+1];
       }
       return letters[0];*/
    }
}
