class Solution {

     public long calculateScore(String s) {
        HashMap<Character,Stack<Integer>> map=new HashMap<>();
        long score=0;
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            int distance=c-'a';
            char mirror=(char)('z'-distance);

            if(map.containsKey(mirror) && !map.get(mirror).isEmpty()){
                score+=i-map.get(mirror).pop();
            }
            else{
                map.computeIfAbsent(c,k->new Stack<>()).push(i);
            }
        }
        return score;
     }
}      

   /* public long calculateScore(String s) {
        HashMap<Character,Character> map=new HashMap<>();
        HashSet<Integer> usedIndices=new HashSet<>();
        for(int i=0;i<s.length();i++){
           map.put(s.charAt(i),(char)('a'+(26-(s.charAt(i)-'a'+1))%26));

        }

        for(Map.Entry<Character,Character> ent:map.entrySet()){
            System.out.println(ent.getKey() +":"+ ent.getValue());
        }
        long diff=0;
        for(int i=0;i<s.length();i++){
            if(usedIndices.contains(i)){
                continue;
            }
            int closeDistance=Integer.MAX_VALUE;
            int closestIndex=-1;
            for(int j=0;j<i;j++){
                if(!usedIndices.contains(j) && (s.charAt(j)==map.get(s.charAt(i)))){
                    int distance=i-j;
                    if(distance<closeDistance){
                        closeDistance=distance;
                        closestIndex=j;
                    }
                    
                }
            }
            if(closestIndex!=-1){
                diff=diff+closeDistance;
                usedIndices.add(i);
                usedIndices.add(closestIndex);
            }
        }
        return diff;
       
        
    }
}
*/