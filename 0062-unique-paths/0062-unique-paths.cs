public class Solution {

public static int CountPath(int i,int j,int m,int n,int [,] matrix){

    if(i>=m || j>=n){
        return 0;
    }
    if(i==m-1 && j==n-1){
        return 1;
    }
    if(matrix[i,j]!=-1){
        return matrix[i,j]; //suppose checking for [1,1] and already [1,1] is marked to 1 then no need to check again
    }
    else{

    matrix[i,j]=CountPath(i+1,j,m,n,matrix)+ CountPath(i,j+1,m,n,matrix);
    return matrix[i,j];
    }
}

    public int UniquePaths(int m, int n) {
        
        int[,] matrix=new int[m,n];

        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                matrix[i,j]=-1;
            }
        }

        int num=CountPath(0,0,m,n,matrix);

        if(m==1 && n==1){
            return num;
        }
        return matrix[0,0];
    }
}