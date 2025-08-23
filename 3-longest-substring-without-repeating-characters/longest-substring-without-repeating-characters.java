class Solution {
    public int lengthOfLongestSubstring(String s) {
        int n=s.length();
        int maxLength=0;
        for(int i=0;i<n;i++){
            Set<Character> seen=new HashSet<>();
            for(int j=i;j<n;j++){
                char ch=s.charAt(j);
                if(seen.contains(ch)){
                    break; //when found duplicate start from new index
                }
                seen.add(ch); //keep adding in set
                maxLength=Math.max(maxLength,j-i+1);
            }
           
        }
        return maxLength;
    }
}