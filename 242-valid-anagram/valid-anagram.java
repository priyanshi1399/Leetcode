class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length()){
            return false;
        }
        HashMap<Character,Integer> sMap=new HashMap<>();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            sMap.put(ch,sMap.getOrDefault(ch,0)+1);
        }
        HashMap<Character,Integer> tMap=new HashMap<>();
         for(int i=0;i<t.length();i++){
            char ch=t.charAt(i);
            tMap.put(ch,tMap.getOrDefault(ch,0)+1);
        }

       for(Map.Entry<Character,Integer> entry:sMap.entrySet()){
        char key=entry.getKey();
        int val=entry.getValue();
        if(!tMap.containsKey(key)){
            return false;
        }
        else if(tMap.get(key)!=val){
            return false;
        }
       }
        return true;
       
    }
}