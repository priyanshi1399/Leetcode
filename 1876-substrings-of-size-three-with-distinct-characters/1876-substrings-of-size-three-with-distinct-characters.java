class Solution {
    public int countGoodSubstrings(String s) {
        /*if(s.length()<3){
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
       return subCount;*/

    //Another Approach
    int [] freq=new int[26];
    int dup=0;
    int count=0;
    for(int i=0;i<s.length();i++){

        freq[s.charAt(i)-'a']++;

        if(freq[s.charAt(i)-'a']==2){
            dup++;
        }
        if(i<2){
            continue;
        }

        if(dup==0){
            count++;
        }

        freq[s.charAt(i-2)-'a']--;

        if(freq[s.charAt(i-2)-'a']==1){
            dup--;
        }
    }
    return count;


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