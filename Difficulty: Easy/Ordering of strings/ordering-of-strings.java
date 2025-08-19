// User function Template for Java

class Solution {
    String[] orderString(String s[], int n) {
        String startString=s[0];
        Arrays.sort(s);
        String [] ans=new String[2];
        ans[0]=s[0];
        ans[1]=s[n-1];
        return ans;
    }
}