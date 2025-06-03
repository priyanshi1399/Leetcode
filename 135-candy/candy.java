class Solution {
    public int candy(int[] ratings) {
        int n=ratings.length;
        int candy=n;

        int i=1;
        while(i<n){
            if(ratings[i]==ratings[i-1]){
                i++;
                continue;
            }
            int peak=0;
            while(ratings[i]>ratings[i-1]){
                peak++;
                candy+=peak;
                i++;
                if(i==n){
                    return candy;  //here no need to remove extra because no extra added
                }
            }
            int dip=0;
            while(i<n && ratings[i]<ratings[i-1]){
                dip++;
                candy+=dip; //here adding dip not 1
                i++; //why not i==n beacuse extra candies need to be removed.
            }

            candy-=Math.min(peak,dip); //to remove extra candy variable  is only one take max value so remove minimum 
        }
        return candy;

    }
}