class Solution {
    public char findTheDifference(String s, String t) {
        HashMap<Character,Integer> map=new HashMap<>();
        for(int i=0;i<t.length();i++){
            char ch=t.charAt(i);
            map.put(ch,map.getOrDefault(ch,0)+1);
        }

        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
                map.put(ch,map.getOrDefault(ch,0)-1);
        }

        
        /*for(Map.Entry<Character,Integer> entry: map.entrySet()){
            if(entry.getValue()>0){
                return entry.getKey();
            }
        }*/

        for(char ch: map.keySet()){
            if(map.get(ch)==1){
                return ch;
            }
        }
    return 'a';
        
    }
}