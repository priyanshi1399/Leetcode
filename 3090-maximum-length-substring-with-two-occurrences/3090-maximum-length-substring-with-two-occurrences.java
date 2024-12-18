class Solution {
    public int maximumLengthSubstring(String s) {
        if(s.length()<2){
            return 0;
        }
        HashMap<Character,Integer> map=new HashMap<>();
        int n=s.length();
        int maxLength=0;
        int start=0;

        for(int end=start;end<n;end++){
            char rightCh=s.charAt(end);
            map.put(rightCh,map.getOrDefault(rightCh,0)+1);
            while(map.get(rightCh)>2){
                char leftCh=s.charAt(start);
                map.put(leftCh,map.get(leftCh)-1);
                   start++;         
            }
            maxLength=Math.max(maxLength,end-start+1);        
            }
                       
        return maxLength;
    }
}