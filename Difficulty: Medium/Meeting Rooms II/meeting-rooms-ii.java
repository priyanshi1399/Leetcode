
class Solution {
    
    public int minMeetingRooms(int[] start, int[] end) {
        int n=start.length;
        Arrays.sort(start);
        Arrays.sort(end);
      
        
        int room=0;
        int freeTime=0;
        
        for(int i=0;i<n;i++){
            if(start[i]<end[freeTime]){
               room++;
                
            }
            else{
                freeTime++;
            }
        }
       
        return room;
    }
}
