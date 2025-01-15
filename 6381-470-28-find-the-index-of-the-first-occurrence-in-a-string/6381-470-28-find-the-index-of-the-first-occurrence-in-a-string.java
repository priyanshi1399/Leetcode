class Solution {
    public int strStr(String haystack, String needle) {
        int i=0;
        int ans=KMP(haystack,needle);
        return ans;
    }

    public int KMP(String txt,String pat){
        List<Integer> res=new ArrayList<>();
        int n=txt.length();
        int m=pat.length();
        int [] LPS=new int[m];

        computeLPS(pat,LPS,m);

        int i=0;
        int j=0;
        while(i<n){
            if(j<m && txt.charAt(i)==pat.charAt(j)){
                i++;
                j++;
            }
            if(j==m){
                return i-m;
            }
            else if(i<n && txt.charAt(i)!=pat.charAt(j)){
                if(j!=0){
                    j=LPS[j-1];
                }
                else{
                    i++;
                }
            }
        }
        return -1;
    }

    public void computeLPS(String pattern, int [] LPS, int m){
        int len=0;
        int i=1;

        while(i<m){
            if(pattern.charAt(i)==pattern.charAt(len)){
                len++;
                LPS[i]=len;
                i++;
            }
           else{
            if(len!=0){
                len=LPS[len-1];
            }
            else{
                i++;
            }
           }
        }
    }
}