// public class Solution {

// public static int CountPath(int i,int j,int m,int n,int [,] matrix){

//     if(i>=m || j>=n){
//         return 0;
//     }
//     if(i==m-1 && j==n-1){
//         return 1;
//     }
//     if(matrix[i,j]!=-1){
//         return matrix[i,j]; //suppose checking for [1,1] and already [1,1] is marked to 1 then no need to check again
//     }
//     else{

//     matrix[i,j]=CountPath(i+1,j,m,n,matrix)+ CountPath(i,j+1,m,n,matrix);
//     return matrix[i,j];
//     }
// }

//     public int UniquePaths(int m, int n) {
        
//         int[,] matrix=new int[m,n];

//         for(int i=0;i<m;i++){
//             for(int j=0;j<n;j++){
//                 matrix[i,j]=-1;
//             }
//         }

//         int num=CountPath(0,0,m,n,matrix);

//         if(m==1 && n==1){
//             return num;
//         }
//         return matrix[0,0];
//     }
// }
//This is brute force involving DP

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