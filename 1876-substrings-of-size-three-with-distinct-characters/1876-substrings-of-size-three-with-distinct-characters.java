class Solution {
    public int countGoodSubstrings(String s) {
        HashMap<Character,Integer> map=new HashMap<>();
        int count=0;
        int n=s.length();
        for(int i=0;i<=n-3;i++){

            for(int j=i;j<i+3;j++){
                map.put(s.charAt(j),map.getOrDefault(s.charAt(j),0)+1);

            if(map.size()==3){
                count++;
            }
        }
        map.clear();
    }
    return count;
}
}