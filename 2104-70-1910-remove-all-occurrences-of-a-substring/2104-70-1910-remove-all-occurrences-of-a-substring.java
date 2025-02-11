class Solution {

   public void computeLPS (String pat, int [] LPS,int m){
    int len=0;
    int i=1;
    while(i<m){
    if(pat.charAt(i)==pat.charAt(len)){
        len++;
        LPS[i]=len;
        i++;
    }
    else if(len!=0){
        len=LPS[len-1];
    }
    else{
        LPS[i]=0;
        i++;
    }
   }
   }
   public int  KMP(String pat ,String txt){
        int n=txt.length();
        int m=pat.length();
        int i=0;
        int j=0;
        int [] LPS=new int[m];
        computeLPS(pat,LPS,m);
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
    public String removeOccurrences(String s, String part) {

            while(KMP(part,s)!=-1){
            int value=KMP(part,s);
            s=s.substring(0,value)+s.substring(value+part.length(),s.length());
            }
        
        return s;
    }
}