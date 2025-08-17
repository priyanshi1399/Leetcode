class Solution {
    public int maximum69Number (int num) {
        int placeValue=0;
        int placeValueSix=-1;
        int n=num;
        while(n!=0){
            int rem=n%10;
            n=n/10;
            if(rem==6){
                placeValueSix=placeValue;
            }
            placeValue++; //get from the right side to check place value
        }
        if(placeValueSix!=-1){
            return num+(3*(int)Math.pow(10,placeValueSix));
        }
        return num;

    }
}