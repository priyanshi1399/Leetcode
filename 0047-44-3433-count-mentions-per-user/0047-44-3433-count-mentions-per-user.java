class Solution {
    public int[] countMentions(int numberOfUsers, List<List<String>> events) {
        int [] mention =new int[numberOfUsers];
        int [] isOnline=new int[numberOfUsers];

        events.sort((a,b)->{
            int timeA=Integer.parseInt(a.get(1));
            int timeB=Integer.parseInt(b.get(1));

            return timeA==timeB? b.get(0).compareTo(a.get(0)): timeA-timeB;
        });

        for(List<String> event:events){
            if(event.get(0).equals("MESSAGE")){
            int timeStamp=Integer.parseInt(event.get(1));
            String eventType=event.get(2);
            if(eventType.equals("ALL")){
                for(int i=0;i<mention.length;i++){
                    mention[i]++;
                }
            }

            else if(eventType.equals("HERE")){
                for(int i=0;i<isOnline.length;i++){
                    if(timeStamp>=isOnline[i]+60){
                        mention[i]++;
                    }
                    else if(isOnline[i]==0){ //never went offline
                        mention[i]++;
                    }
                }
            }
            else{ //"id1 id0"
            String [] ids=event.get(2).split(" ");
            for(String userID: ids){
                int id=Integer.parseInt(userID.substring(2));
                mention[id]++;
            }

            }
            }

            else if(event.get(0).equals("OFFLINE")){
                     int id=Integer.parseInt(event.get(2));
                     isOnline[id]=Integer.parseInt(event.get(1));
                }
            }

        return mention;

            
        }
    }
