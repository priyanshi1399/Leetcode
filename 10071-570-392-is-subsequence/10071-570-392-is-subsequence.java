class Solution {
    public boolean isSubsequence(String s, String t) {
        return recursion(s,t,0,0);
    }

    public boolean recursion(String s, String t,int left,int right){
        if(left==s.length()){
            return true;
        }
        if(right==t.length()){
            return false;
        }
        if(s.charAt(left)==t.charAt(right)){
            return recursion(s,t,left+1,right+1);
        }
        else{
            return recursion(s,t,left,right+1);
        }
    }
}