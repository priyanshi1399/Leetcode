class Solution {
    public int lengthOfLongestSubstring(String s) {
        if(s.equals("")){
          return 0; 
        }
        int left=0;
        int n=s.length();
        int maxLength=0;
        HashMap<Character,Integer> map=new HashMap<>();
        for(int right=0;right<n;right++){
            char ch=s.charAt(right);
            if(map.containsKey(ch) && map.get(ch)>=left){
                left=map.get(ch)+1;
            }
            
            map.put(ch,right);
            maxLength=Math.max(maxLength,right-left+1);
        }
        return maxLength;
    }
}