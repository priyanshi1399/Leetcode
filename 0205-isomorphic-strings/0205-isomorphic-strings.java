class Solution {
    public boolean isIsomorphic(String s, String t) {
        HashMap<Character,Integer> s1=new HashMap<Character,Integer>();
        HashMap<Character,Integer> t1=new HashMap<Character,Integer>();

        for(int i=0;i<s.length();i++){
            if(!s1.containsKey(s.charAt(i))){
                s1.put(s.charAt(i),i);
            }
            if(!t1.containsKey(t.charAt(i))){
                t1.put(t.charAt(i),i);
            }

            if(s1.get(s.charAt(i))!=t1.get(t.charAt(i))){
                return false;
            }

        }
        return true;

        /*HashMap<Character,Character> map=new HashMap<>();
        for(int i=0;i<s.length();i++){
            char schars=s.charAt(i);
            char tchars=t.charAt(i);
            
            if(map.containsKey(schars)){
               if(map.get(schars)!=tchars){
                return false; //exmaple paper , title  here value at p is equal t if not return false
               }
            }

            else{
               if(map.containsValue(tchars)){
                return false; //"badc"  and "baba" b is already mapped to b so cant mapped to d
               }
            }
            map.put(schars,tchars);
            }
        
        return true;*/
    }
}