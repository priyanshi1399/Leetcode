class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> result=new ArrayList<>();
        Arrays.sort(nums);
        int n=nums.length;
        for(int i=0;i<=n-3;i++){
            int j=i+1;
            int k=n-1;
            while(j<k){
            if(nums[i]+nums[j]+nums[k]<0){
                j++;
            }
            else if(nums[i]+nums[j]+nums[k]>0){
                k--;
            }
            else{
                //fouund one of my answer
                result.add(Arrays.asList(nums[i],nums[j],nums[k]));
                while(j<k && nums[j]==nums[j+1]){
                j++;
                }
                while(j<k && nums[k]==nums[k-1]){
                    k--; //-1, 0, 0, 1 , 1 
                    /*
                    i=0
                    j=1
                    k=4 here if you decrease k then same value so jab tak same tab tak decraese aur increase
                    */
                    //this is for duplicates
                    /*
                        0  1  2  3 4  5
                        -4 -1 -1 0 1 2 
                        i=0 j=1 k=5
                        nums[i]+nums[j]+nums[k]=
                        -4-1+2=-3<0 sum maximize
                        j++;
                        -4-1+2=-3<0
                        j++;
                        -4+0+2=-2<0 maximize
                        j++; j=4
                        -4+1+2=-1<0 maximize
                        j++;j==5,k=5 wrong
                        -4 -1 -1 0 1 2 
                        i=1;j=2;k=5
                        -1-1+2=0  ans=[[-1,-1,2]]
                        j++; k--;
                        i=1;j=3;k=4
                        -1+0+1=0   ans=[[-1,-1,2],[-1,0,1]]
                        0  1   2 3 4 5
                        -4 -1 -1 0 1 2   ; n=6 ;n-3=3
                        j++; k--;
                        i=1 ;j=4 ;k=3 
                         0  1  2 3 4 5
                        -4 -1 -1 0 1 2  
                        //here we are wrong because at i=1, i=2 there is -1 so it will skip duplicate i++;
                        i=2;j=3;k=5
                        -1+0+2=1>0 k--;
                        i=2;j=3;k=4
                        -1+0+1=0; it will not add
                        i=3;j=4;k=5
                        3>0 k--;
                        i=3 ;j=4;k=4 out of the loop
                    */
                }
                j++;
                k--;
            }
        }
        while(i+1<n && nums[i]==nums[i+1]){
            i++; //skip duplicate
        }
        
    }
    return result;
}
}

//Time Complexity will be 0(nlong)+0(n^2)
/*
[-1,-1,0,1,2,4]
i=0, j=i+1=1, k=5
nums[i]+nums[j]+nums[k]=2
i=0, j=1, k=4
nums[i]+nums[j]+nums[k]=0
Ans = [-1,-1,2]
j++
k--
i=0,j=2,k=3
nums[i]+nums[j]+nums[k]=0
Ans= [[-1,-1,2], [-1,0,1]]
j++
k--
i=0,j=3,k=2
i++
i=1
i++
i=2
nums[2]=0
j=3
k=5
nums[i]+nums[j]+nums[k]=5
k=4
nums[i]+nums[j]+nums[k]=3
k=3
i=3
j=4
k=5
nums[i]+nums[j]+nums[k]=7
k=4
i=4
*/




