class Solution {

    public void merge(int[] nums1, int m, int[] nums2, int n) {
     /*for(int i=n-1;i>=0;i--){
        if(nums2[i]>nums[i]){
            nums1[n+i]=nums2[i];
        }
        else{

        }
     }
*/
    int i=m-1, j=n-1,k=m+n-1;
    while(i>=0 && j>=0){
        if(nums1[i]<nums2[j]){
            nums1[k--]=nums2[j--];
        }
        else{
            nums1[k--]=nums1[i--];
        }
    }
    // while(i>=0){
    //     nums1[k--]=nums1[i--];
    // }
    while(j>=0){
        nums1[k--]=nums2[j--];
    }
     //[1,2,3(i),0,0,0(k)]
     //[2,5,6(j)]

    //[1,2,3(i),0,0(k),0]
     //[2,5(j),6]

      //[1,2,3(i),0,0(k),0]
     //[2,5(j),6]



    /*public void swapIfGreater(int[] nums1,int[] nums2, int idx1,int idx2){
        if(nums1[idx1]>nums2[idx2]){
            int temp=nums1[idx1];
            nums1[idx1]=nums2[idx2];
            nums2[idx2]=temp;
        }
    }

    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int len=n+m;
        int gap=(len/2)+(len%2);
        
        while(gap>0){
        int left=0;
        int right=left+gap;

        while(right<len){
            //when left in arr1 and right in arr2
            if(left<m &&right>=m){
                swapIfGreater(nums1,nums2,left,right-m); //because right in on the other side of nums2 so there will be index 5,6 like that
                //to make it 1, 2 like this we need to subtract right-length of first array
            }
            else if(left>=m){
                swapIfGreater(nums2,nums2,left-m,right-m);
            }
            else{
                 swapIfGreater(nums1,nums1,left,right);
            }
            left++;
            right++;
        }        
        if(gap==1){
            break;
        }
        gap=(gap/2)+(gap%2);
        }

        //copy the elements of nums2 to nums1
        for(int i=m;i<m+n;i++){
            nums1[i]=nums2[i-m]; //m=3 then 3-3 nums1[3]=0,....like this
        }*/
         //T(C)--->0(log2(m+n))*0(n+m) S(C)->0(1)
       /* int [] arr=new int[n+m];
        int left=0;
        int right=0;
        int index=0;
        while(left<m && right<n){
            if (nums1[left]<=nums2[right]){
                arr[index]=nums1[left];
                left++;
                index++;
            }
            else{
                arr[index]=nums2[right];
                right++;
                index++;
            }
        }
        while(left<m){
            arr[index]=nums1[left];
            index++;
            left++;
        }
        while(right<n){
            arr[index]=nums2[right];
            index++;
            right++;
        }

        for(int i=0;i<m+n;i++){
            nums1[i]=arr[i];
        } //0(n+m)+0(n+m)-->t(C)
    */
    }
}
        /*int i=0;
        while(n-->0){
            nums1[m+i]=nums2[i];
            i++;
        }
        Arrays.sort(nums1);
    }
}*/
        /*int i=0;
        while(n>0){
            nums1[m]=nums2[i];
            m++;
            i++;
            n--;
        }

        MergeSort(nums1,0,nums1.length-1);
        
    }

    void MergeSort(int []nums1,int low,int high){
        if(low>=high)return;
        int mid=(low+high)/2;
        MergeSort(nums1,low,mid);
        MergeSort(nums1,mid+1,high);
        MergeAll(nums1,low,mid,high);
    }

    void MergeAll(int[] nums1,int low,int mid,int high){
        int left=low;
        int right=mid+1;
        int x=0;
        int temp[]=new int[high-low+1];
        while(left<=mid && right<=high){
            if(nums1[left]<=nums1[right]){
                temp[x]=nums1[left];
                x++;
                left++;
            }
            else{
                temp[x]=nums1[right];
                x++;
                right++;
            }
        }
        while(left<=mid){
            temp[x]=nums1[left];
                x++;
                left++;
        }
        while(right<=high){
             temp[x]=nums1[right];
                x++;
                right++;
        }
    
    for(int i=0,j=low;i<temp.length;i++,j++){
        nums1[j]=temp[i];
    }
    }*/
//}