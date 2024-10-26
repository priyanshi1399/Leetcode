class Solution {
    public int[] shuffle(int[] nums, int n) {

        int [] res=new int [2*n];
        int i=0;
        int j=n;
        int k=0;
        while(k<2*n){
            res[k++]=nums[i++];
            res[k++]=nums[j++];
        }
        return res;
    }
}
/*
[2,5,1,3,4,7]
i=0->1-->2-->3
j=3->4
k=0-->1-->3

res[0]=2
res[1]=3
res[2]=5
res[3]=4
res[4]=1
res[5]=7

now k=6 and 6<2*3 wrong 

*/

        /*int k=nums.length;
        int [] res=new int[k];
        for(int i=0;i<n;i++){
            res[2*i]=nums[i];
            res[2*i+1]=nums[n+i];
        }
        return res;
    }
}*/