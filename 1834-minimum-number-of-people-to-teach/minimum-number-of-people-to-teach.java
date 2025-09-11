class Solution {
    public int minimumTeachings(int n, int[][] languages, int[][] friendships) {
        HashSet<Integer> sadUsers=new HashSet<>();
        for(int [] fs:friendships){
            int user1=fs[0]-1; //-1 for 0-based indexing
            int user2=fs[1]-1;
            HashSet<Integer> checkCommonSet=new HashSet<>();
            for(int i=0;i<languages[user1].length;i++){
                checkCommonSet.add(languages[user1][i]);
            }
            boolean canTheyTalk=false;
            for(int i=0;i<languages[user2].length;i++){
                if(checkCommonSet.contains(languages[user2][i])){
                    canTheyTalk=true;
                    break;
                }
            }
            if(canTheyTalk==false){
                sadUsers.add(user1);
                sadUsers.add(user2);
            }
        }
        for(int sadUser:sadUsers){
            System.out.println(sadUser);
        }

        HashMap<Integer,Integer> map=new HashMap<>();
        for(int sadUser:sadUsers){
            int [] ListOfUsers=languages[sadUser];
            for(int j=0;j<ListOfUsers.length;j++){
                map.put(ListOfUsers[j],map.getOrDefault(ListOfUsers[j],0)+1);
            }
            
        }
        for(Map.Entry<Integer,Integer> entry:map.entrySet()){
            System.out.println(entry.getKey() + ":" + entry.getValue());
        }
        //find most talked language among sadUsers

        List<Integer> maxValue=new ArrayList<>(map.values());
           maxValue.sort(Collections.reverseOrder());
        //System.out.println(sadUsers.size());
        return sadUsers.size()-(maxValue.size()>0?maxValue.get(0):0);




    }
}