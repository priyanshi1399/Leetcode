class Solution {
    public int largestAltitude(int[] gain) {
        int n=gain.length;
        int alt = 0;
        int ans = 0; //not needed max
        for(int i=0;i<n;i++){
            alt=alt+gain[i];
            ans=Math.max(ans,alt);
        }
    return ans;
    }
}

/*
[-4,-3,-2,-1,4,3,2]
alt=0
ans=0
i=0
alt=-4
ans=0
i=1
alt=-7
ans=0(max)
i=2
alt=-7+-2=-9
ans=0
i=3
alt=-10
ans=0
i=4
alt=-6
ans=0
i=5
alt=-3
ans=0
i=6
alt=-1
ans=0
if next 7
i=7
alt=6
ans=6
*/
//altitue=0
//altitude=-5
//altitude=1
//altitude=1
//altitude=-6
