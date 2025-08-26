class Solution {
    public boolean checkAllValuesZero(int [] letters){
        for(int i=0;i<26;i++){
            if(letters[i]!=0){
                return false;
            }
        }
        return true;
    }
    public List<Integer> findAnagrams(String s, String p) {
        int k=p.length();
        int sLen=s.length();
        List<Integer> res=new ArrayList<>();
        if(k>sLen){
            return res; //if p is greater than s
        }
        int [] letters=new int[26];
        for(int i=0;i<k;i++){
            letters[p.charAt(i)-'a']++; //fill the smallest one (p)
        }

        int end=0;
        int start=0;
        while(end<sLen){

            letters[s.charAt(end)-'a']--; //removing as we traverse

            while(end-start+1==k){ //fits in my window
                if(checkAllValuesZero(letters)){
                    res.add(start);
                }
                letters[s.charAt(start)-'a']++; //shifting the window
                start++;
            }
            end++;

        }
        return res;
    }
}