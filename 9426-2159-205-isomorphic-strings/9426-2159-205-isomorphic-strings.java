class Solution {
    public boolean isIsomorphic(String s, String t) {
        HashMap<Character,Character> map1=new HashMap<>();
        HashMap<Character,Character> map2=new HashMap<>();

        if(s.length()!=t.length()){
            return false;
        }

        for(int i=0;i<s.length();i++){
            char ch1=s.charAt(i);
            char ch2=t.charAt(i);
            map1.put(ch1,ch2);
            map2.put(ch2,ch1);
        }
        if(map1.size()!=map2.size()){
            return false;
        }
        for(Map.Entry<Character,Character> ent: map1.entrySet()){
            System.out.println(ent.getKey() + ":" + ent.getValue());
        }

        for(Map.Entry<Character,Character> entry: map2.entrySet()){
            System.out.println(entry.getKey() + ":" + entry.getValue());
        }
       for(int i=0;i<s.length();i++){
        if(map1.get(s.charAt(i))!=t.charAt(i)){
            return false;
        }
       }
       return true;
    }
}