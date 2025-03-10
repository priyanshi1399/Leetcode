class Solution {
    public int numberOfAlternatingGroups(int[] colors) {
        int n=colors.length;
        int count=0;
        for(int i=0;i<n;i++){
            if(colors[i%n]==0){
                if((colors[(i+1)%n]==1 && colors[(i+2)%n]==0)){
                    count++;
                }
            }
            else{
                if((colors[(i+1)%n]==0 && colors[(i+2)%n]==1)){
                    count++;
                }
            }
        }
        return count;
    }
}