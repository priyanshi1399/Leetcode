class Solution {
    public boolean bothArraysAreEqual(int [] sArray, int [] pArray){
        for(int i=0;i<26;i++){
            if(sArray[i]!=pArray[i]){
                return false;
            }
        }
        return true;
    }
    public List<Integer> findAnagrams(String s, String p) {
        int pLen=p.length();
        int sLen=s.length();
         List<Integer> ans=new ArrayList<>();
        if(pLen>sLen){
            return ans;
        }
       
       int [] countS=new int[26];
       int [] countP=new int[26];
        for(int i=0;i<pLen;i++){ //first calculate for 0 
            countS[s.charAt(i)-'a']++;
            countP[p.charAt(i)-'a']++;
        }
        if(Arrays.equals(countS,countP)){
                ans.add(0);
            }

        for(int i=pLen;i<s.length();i++){ //first calculate for 0 
            countS[s.charAt(i)-'a']++;
            countS[s.charAt(i-pLen)-'a']--; //reducing previous index elements value
            if(bothArraysAreEqual(countS,countP)){
                ans.add(i-pLen+1);
            }
           
        }

        return ans;
    }
}