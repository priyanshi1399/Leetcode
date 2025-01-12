class Solution {
    public boolean isIsomorphic(String s, String t) {
        if(s.length()!=t.length()){
            return false;
        }
        HashMap<Character,Character> m=new HashMap<>();
        for(int i=0;i<s.length();i++){
            char s1=s.charAt(i);
            char t1=t.charAt(i);

            if(m.containsKey(s1) && m.get(s1)!=t1){
                return false;
            }else if(!m.containsKey(s1) && m.containsValue(t1)){
                return false;
            }
            m.put(s1,t1);

            /*fob
            baa
            */
        }
        return true;


    }
}

/*
e=a
g=d

*/