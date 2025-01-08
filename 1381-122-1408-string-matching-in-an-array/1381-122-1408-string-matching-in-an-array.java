class Solution {
    public void ComputeLPS(String pat, int [] LPS, int m){
        int len=0;
        int i=1;

        while(i<m){
            if(pat.charAt(i)==pat.charAt(len)){
                len++;
                LPS[i]=len;
                i++;
            }
            else{
                if(len!=0){
                    len=LPS[len-1];
                }
                else{
                    LPS[i]=0;
                    i++;
                }
            }
        }
    }

    public boolean KMP(String txt, String pattern){
        int n=txt.length();
        int m=pattern.length();
        int [] LPS=new int[m];
        ComputeLPS(pattern,LPS,m);
        int i=0;
        int j=0;

        while(i<n){

            if(j<m && txt.charAt(i)==pattern.charAt(j)){
                i++;
                j++;
            }
            if(j==m){
                return true;
            }
            else if(i<n && txt.charAt(i)!=pattern.charAt(j)){
                if(j!=0){
                    j=LPS[j-1];
                }
                else{
                    i++;
                }
            }

        }
        return false;

    }

    public List<String> stringMatching(String[] words) {
        int n=words.length;
        List<String> result=new ArrayList<>();
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(i==j){
                    continue;
                }
                else{
                    if(KMP(words[i],words[j])){
                        if(!result.contains(words[j])){
                        result.add(words[j]);
                        }
                        
                    }
                    
                }
            }
        }
        return result;
    }
}