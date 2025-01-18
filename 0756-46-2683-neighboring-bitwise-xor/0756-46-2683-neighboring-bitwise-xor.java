class Solution {
    public boolean doesValidArrayExist(int[] derived) {
        int dLen=derived.length;
        int [] original=new int[dLen];
        int oLen=original.length;
        original[0]=0;
        for(int i=0;i<oLen-1;i++){
            original[i+1]=original[i]^derived[i];
        }

        if((original[oLen-1]^original[0])==(derived[dLen-1])){
            return true;
        }

        original[0]=1;
        for(int i=0;i<oLen-1;i++){
            original[i+1]=original[i]^derived[i];
        }

        if((original[oLen-1]^original[0])==(derived[dLen-1])){
            return true;
        }
        return false;

    }
}