class Solution {
    public int maxJump(int[] stones) {
        int maxJump=0;
        if(stones.length==2){
            return stones[stones.length-1];
        }
        for(int i=0;i<stones.length-2;i++){
            maxJump=Math.max(maxJump,stones[i+2]-stones[i]);
        }
        return maxJump;
    }
}