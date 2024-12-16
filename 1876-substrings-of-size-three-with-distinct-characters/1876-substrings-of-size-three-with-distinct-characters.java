class Solution {
    public int countGoodSubstrings(String s) {
        if(s.length()<3){
            return 0;
        }
       HashMap<Character,Integer> map=new HashMap<>();
       int count=0;
        int subCount=0;

       for(int i=0;i<s.length();i++){
        count++;
        map.put(s.charAt(i),map.getOrDefault(s.charAt(i),0)+1);
        
    
        if((count==3) &&(map.size()==3)){
            for(Map.Entry<Character,Integer> ent:map.entrySet()){
            System.out.println(ent.getKey()+ ":"+ ent.getValue());
            }
            subCount++;
            count=0;
            map.clear();
            i=i-3+1;
        }
        else if((count==3) && (map.size()<3)){
            count=0;
            map.clear();
            i=i-3+1;
        }
       
       }
       return subCount;

        /*HashMap<Character,Integer> map=new HashMap<>();
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
    return count;*/
}
}