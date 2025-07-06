class Solution {
    public String mostCommonWord(String paragraph, String[] banned) {
        String cleaned = paragraph.replaceAll("\\W+", " ").toLowerCase();
        String [] parts=cleaned.split("\\s+");
        HashSet<String> bannedList=new HashSet<>(Arrays.asList(banned));
        HashMap<String,Integer> map=new HashMap<>();
        for(int i=0;i<parts.length;i++){
            if(!bannedList.contains(parts[i])){
                map.put(parts[i],map.getOrDefault(parts[i],0)+1);
            }
        }

        String mostCommon="";
        int maxFrquency=Integer.MIN_VALUE;
        for(Map.Entry<String,Integer> entry:map.entrySet()){
            int freq=entry.getValue();
            if(freq>maxFrquency){
                mostCommon=entry.getKey();
                maxFrquency=freq;
            }
        }
        return mostCommon;

    }
}