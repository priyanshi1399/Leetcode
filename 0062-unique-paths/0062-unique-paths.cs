public class Solution {
    public int UniquePaths(int m, int n) {
        int N=n+m-2;
        int r=m-1;
        double res=1;
        for(int i=1;i<=r;i++){
            res=res*(N-r+i)/i;
        }
        return (int)res;
    }
}


//simple observation total direction for m=3,n=2 (m-1)+(n-1)=m+n-2 RDR,RRD,DRR
//here T(C)=0(m-1) or 0(n-1) depending on your case
//S(C)-0(1)