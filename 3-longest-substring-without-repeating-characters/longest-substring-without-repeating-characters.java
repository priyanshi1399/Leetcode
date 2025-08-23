class Solution {
    public int lengthOfLongestSubstring(String s) {
        int left=0;
        int n=s.length();
        int maxLength=0;
        HashMap<Character,Integer> map=new HashMap<>();
        for(int right=0;right<n;right++){
            char ch=s.charAt(right);
            if(map.containsKey(ch)){ //check for duplicate
                left=Math.max(left,map.get(ch)+1); //to be in current window part
            }
            
            map.put(ch,right); //keep putting in map with index
            maxLength=Math.max(maxLength,right-left+1); //calculate maxLength
        }
        return maxLength;
    }
}