class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        //first choose the lesser size array 
        //find by recusrion by swapping

        //l=0,r=m ; taken all element (m)
        //mid(px)  and take Py for nums2->(m+n+1)/2-px

        //calculate x1,x2,x3,x4 calculate median by checking size
        //if x>x4 h=mid-1 else l=mid+1

        int m=nums1.length;
        int n=nums2.length;
        if(m+n==1){
            return (double)nums1.length==1?nums1[0]:nums2[0];
        }
        if(nums1.length>nums2.length){
            return findMedianSortedArrays(nums2,nums1);
        }

        int l=0;
        int r=m;
        while(l<=r){
            int Px=l+(r-l)/2; //for nums1
            int Py=(m+n+1)/2-Px; //for nums2
            //left half
            int x1= (Px==0)?Integer.MIN_VALUE:nums1[Px-1]; //in this part its last element
            int x3= (Px==m)?Integer.MAX_VALUE:nums1[Px];
            

            //right half
            int x2= (Py==0)?Integer.MIN_VALUE:nums2[Py-1];
            int x4= (Py==n)?Integer.MAX_VALUE:nums2[Py];

            if(x1<=x4 && x2<=x3){
                if((m+n)%2==1){ //if its odd 
                    return (double)Math.max(x1,x2);
                }
                else{
                    return (Math.max(x1,x2)+Math.min(x3,x4))/2.0;
                }
            }
            else if(x1>x4){ //taken more elments
                r=Px-1;
            }
            else{
                l=Px+1;
            }

        }
        return -1;

    }
}