class Solution {
    public int[][] imageSmoother(int[][] img) {
        int m =img.length;
        int n=img[0].length;

        int [] prevRow=new int[n];
        int topCorner=0;

        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){

                int sum=0;
                int count=0;
                //Bottom Corner neighbour->[i+1][j-1],[i+1][j],[i+1][j+1]
                if(i+1<m){
                    if(j-1>=0){
                       sum=sum+ img[i+1][j-1];
                       count++;
                    }

                    sum=sum+img[i+1][j]; //this will not be out of bound j is in the range
                    count++;

                    if(j+1<n){
                        sum=sum+img[i+1][j+1];
                        count++;
                    }
                }

                // just right neighbour
                //[i][j+1]

                if(j+1<n){
                    sum=sum+img[i][j+1];
                    count++;
                }


            //just left
            //[i][j-1]

            if(j-1>=0){
                sum=sum+prevRow[j-1];
                count++;
            }

                //current cell

                sum=sum+img[i][j];
                count++;

                //Top neighbours i-1th row

                if(i-1>=0){
                    //[i-1][j-1]
                    if(j-1>=0){
                        sum=sum+topCorner;
                        count++;
                    }

                //[i-1][j] ,[i-1][j+1]

                sum=sum+prevRow[j];
                count++;

                //[i-1][j+1]
                if(j+1<n){
                    sum=sum+prevRow[j+1];
                    count++;
                }
            
            }

           

            if(i-1>=0){
            topCorner=prevRow[j];
            }
            prevRow[j]=img[i][j];

            img[i][j]=sum/count;

            }
        }

        return img;
    }
}