class Solution {
    public int maxDistance(String moves) {
        int up=0,down=0,left=0,right=0,wild=0;
        int n=moves.length();
        for(int i=0;i<n;i++){
            char ch=moves.charAt(i);
            if(ch=='U'){
                up++;
            }
            else if(ch=='D'){
                down++;
            }
            else if(ch=='L'){
                left++;
            }
            else if(ch=='R'){
                right++;
            }
            else{
                wild++;
            }
        }
        return Math.abs(left-right)+Math.abs(up-down)+wild;
    }
}

//every moves you have to calculate and _ will be an extra move. to maximize any distance (left-right) and (up-sown)+wild;