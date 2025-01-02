class Solution {



      public boolean isVowel(String str){
        char [] ch=str.toCharArray();
        int n=ch.length;

        if((ch[0]=='a' || ch[0]=='e' || ch[0]=='i' || ch[0]=='o' || ch[0]=='u') && 
        (ch[n-1]=='a' || ch[n-1]=='e' || ch[n-1]=='i' || ch[n-1]=='o' || ch[n-1]=='u')){
            return true;
        }
        return false;
    }


      public int[] vowelStrings(String[] words, int[][] queries) {
        int n=words.length;
        int [] cumulativeSum=new int[n];
        int sum=0;
        for(int i=0;i<n;i++){
            if(isVowel(words[i])){
                sum++;
            }
            cumulativeSum[i]=sum;
        }

        int m=queries.length;
        int [] ans=new int [m];
        for(int i=0;i<m;i++){
            int start=queries[i][0];
            int end=queries[i][1];
        
        if(start>0){
        ans[i]=cumulativeSum[end]-cumulativeSum[start-1];
        }
        else{
            ans[i]=cumulativeSum[end]-0;
        }
        }

        return ans;
      }
}

   /* public boolean isVowel(String str){
        char [] ch=str.toCharArray();
        int n=ch.length;

        if((ch[0]=='a' || ch[0]=='e' || ch[0]=='i' || ch[0]=='o' || ch[0]=='u') && 
        (ch[n-1]=='a' || ch[n-1]=='e' || ch[n-1]=='i' || ch[n-1]=='o' || ch[n-1]=='u')){
            return true;
        }
        return false;
    }

    public int checkIsVowelFirstandLast(int st,int end, String[] words){
        int count=0;
        for(int i=st;i<=end;i++){
            if(isVowel(words[i])){
                count++;
            }
        }
        return count;
    }

    public int[] vowelStrings(String[] words, int[][] queries) {
        int n=queries.length;
        int [] ans=new int[n];
        for(int i=0;i<n;i++){
            int start=queries[i][0];
            int end=queries[i][1];

            ans[i]=checkIsVowelFirstandLast(start,end,words);
        }
        return ans;
    }
 
}*/ //this will give TLE