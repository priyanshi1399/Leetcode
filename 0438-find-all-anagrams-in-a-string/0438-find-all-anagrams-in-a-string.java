class Solution {

    public static boolean isEqual(int [] countA, int [] countB){
        boolean flag=true;

        for(int i=0;i<26;i++){
            if(countA[i]!=countB[i]){
                flag=false;
                break;
            }
        }
        return flag;
    }
    public List<Integer> findAnagrams(String s, String p) {
        int lP=p.length();
        List<Integer> l=new ArrayList<>();
        if(s.length()<lP){
            return l;
        }
        int  [] countS= new int [26];
        int  [] countP= new int [26];

        for(int i=0;i<lP;i++){
            countS[s.charAt(i)-'a']++;
            countP[p.charAt(i)-'a']++;
        }
        if(isEqual(countS,countP)){
            l.add(0);
        }
        for(int i=lP;i<s.length();i++){
            countS[s.charAt(i)-'a']++;
            countS[s.charAt(i-lP)-'a']--;
            if(isEqual(countS,countP)){
            l.add(i-lP+1);
        }
        }
        return l;

    }
} 

   /* public boolean foundAnagram(String subpart,char [] p1){
        char [] subpart1=subpart.toCharArray();
        Arrays.sort(subpart1);
        if(Arrays.equals(subpart1,p1)){
            return true;
        }
        return false;
    }

    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> result=new ArrayList<>();
        if(p.length()>s.length()){
            return result;
        }
         String subPart="";
        char [] p1=p.toCharArray();
        int k=p.length();
        int i=0;
        for(;i<s.length()-k;i++){
        subPart=s.substring(i,i+k);
        if(foundAnagram(subPart,p1)){
            result.add(i);
            break;
        }
        }

        for(i=k;i<s.length();i++){
            subPart=s.substring(i-k+1,i+1);
            System.out.println(subPart);
            if(foundAnagram(subPart,p1)){
                if(!result.contains(i-k+1)){
                result.add(i-k+1);
            }
            }
        }
        return result;*/


    /*public String findSubstring(int i,int j,String s){
        String newString="";
        for(int start=i;start<j;start++){
            newString=newString+s.charAt(start);
        }
        return newString;
    }

      public List<Integer> findAnagrams(String s, String p) {
        List<Integer> res=new ArrayList<>();
        char [] p1=p.toCharArray();
        Arrays.sort(p1);
        int len=p1.length;
        for(int i=0;i<=s.length()-len;i++){
                String subpart=findSubstring(i,i+len,s);
                char [] s1=subpart.toCharArray();
                Arrays.sort(s1);
                if(Arrays.equals(s1,p1)){
                    res.add(i);
                }
        }
        return res;*/
   // }
//}

