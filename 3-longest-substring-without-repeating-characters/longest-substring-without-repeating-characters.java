class Solution {
    public int lengthOfLongestSubstring(String s) {
        if(s.equals("")){
          return 0; 
        }
        int j=0;
        int i=0;
        int n=s.length();
        int maxLength=0;
        HashMap<Character,Integer> map=new HashMap<>();
        while(j<n){
            char ch=s.charAt(j);
            while(map.containsKey(ch)){
                map.put(s.charAt(i),map.getOrDefault(s.charAt(i),0)-1);
                if(map.get(s.charAt(i))==0){
                    map.remove(s.charAt(i));
                }
                i++;
            }
            map.put(ch,map.getOrDefault(ch,0)+1);
            maxLength=Math.max(maxLength,j-i+1);
            j++;
        }
        return maxLength;
    }
}