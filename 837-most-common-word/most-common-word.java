class Solution {
    public String mostCommonWord(String paragraph, String[] banned) {
        String para = paragraph.replaceAll("\\W+", " ").toLowerCase();
        String [] words=para.split("\\s+");
        HashSet<String> bannedSet=new HashSet<>(Arrays.asList(banned));
        HashMap<String,Integer> map=new HashMap<>();
        for(String s: words){
            if(!bannedSet.contains(s)){
                map.put(s,map.getOrDefault(s,0)+1);
            }
        }

        return Collections.max(map.entrySet(),Map.Entry.comparingByValue()).getKey();
        /*
        String mostCommon="";
        int maxFrquency=Integer.MIN_VALUE;
        for(Map.Entry<String,Integer> entry:map.entrySet()){
            int freq=entry.getValue();
            if(freq>maxFrquency){
                mostCommon=entry.getKey();
                maxFrquency=freq;
            }
        }
        return mostCommon;*/

    }
}