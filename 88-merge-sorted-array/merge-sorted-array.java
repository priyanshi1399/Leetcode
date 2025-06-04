class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int i=m-1;
        int j=n-1;
        int k=m+n-1;
    while(i>=0 && j>=0){
        if(nums1[i]<=nums2[j]){
            nums1[k]=nums2[j];
            k--;
            j--;
        }
        else{
            nums1[k]=nums1[i];
            k--;
            i--;
        }
    }

        while(i>=0){
            nums1[k]=nums1[i];
            k--;
            i--;
        }
        while(j>=0){
            nums1[k]=nums2[j];
            k--;
            j--;
        }
    
    
    }
}


/*nums1 = [1,2,2,3,5,6]
           ik
int i=m-1
int j=n-1
int k=m+n-1

 nums2 = [2,5,6]
          

while(i>=0 && j>=0){
if(nums[i]<=nums[j]){
    nums[k]=nums[j];
    k--;
    j--;
}
else{
    nums[k]=nums[i];
    k--;
    i--;
}


while(i>=0){
    nums[k]=nums[i];
    k--;
    i--;
}
while(j>=0){

}*/