class Solution {
    public String minWindow(String s, String t) {
        int n=t.length();
        int len=s.length();
        int minLength=Integer.MAX_VALUE;
        HashMap<Character,Integer> map=new HashMap<>();
        if(t.length()>s.length()){
            return "";
        }
        int start=0;
        for(int i=0;i<n;i++){
            char ch=t.charAt(i);
            map.put(ch,map.getOrDefault(ch,0)+1); //putting t string values in map
        }
        int count=map.size();
            int j=0;
            int i=0;
            while(j<len){
                if(map.containsKey(s.charAt(j))){
                    map.put(s.charAt(j),map.getOrDefault(s.charAt(j),0)-1);
                    if(map.get(s.charAt(j))==0){ //keeping count in mnegative in map
                        count--; //main count will decrease
                    }
                }

            if(count==0){
                while(count==0){
                    char ch=s.charAt(i);
                    if(map.containsKey(ch)){
                        map.put(ch,map.getOrDefault(ch,0)+1); //extra character
                        if(map.get(ch)==1){
                            count++;
                        if(j-i+1<minLength){ //the invalid window becomes calculate the length
                            minLength=j-i+1;
                            start=i;
                        }
                        }
                    }
                    i++;
                }
            }
            j++;
    }
    System.out.println(start);
    return minLength==Integer.MAX_VALUE?"":s.substring(start,start+minLength);
}
}