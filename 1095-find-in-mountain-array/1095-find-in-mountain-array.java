/**
 * // This is MountainArray's API interface.
 * // You should not implement it, or speculate about its implementation
 * interface MountainArray {
 *     public int get(int index) {}
 *     public int length() {}
 * }
 */
 
class Solution {

private int binarySearch(MountainArray mountainArr, int target,int left ,int right, boolean isAscending){
    while(left<=right){
        int mid=(left+right)/2;
        int midValue=mountainArr.get(mid);
        if(midValue==target){
            return mid;
        }
        if(isAscending){
            if(midValue<target){
                left=mid+1;
            }
            else{
                right=mid-1;
            }
        }
        else{
            if(midValue<target){
                right=mid-1;
            }
            else{
                left=mid+1;
            }
        }
    }
    return -1;
}


public int findInMountainArray(int target, MountainArray mountainArr) {

    int l=0;
    int r=mountainArr.length()-1;
    while(l<r){
        int mid=(l+r)/2;
        int midVal=mountainArr.get(mid);
        int midNextVal=mountainArr.get(mid+1);
        if(midVal<midNextVal){
            l=mid+1;
        }
        else{
            r=mid;
        }
    }
        int peakIndex=l;
        int leftResult=binarySearch(mountainArr,target,0,peakIndex,true);
        if(leftResult!=-1){
            return leftResult;
        }
        int rightResult=binarySearch(mountainArr,target,peakIndex,mountainArr.length()-1,false);
        

    
    return rightResult;
}
}


   /*public int binarySearch(MountainArray mountainArr, int target, int left,int right, boolean isAscending){
        while(left<=right){
            int mid=left+(right-left)/2;
            int midValue=mountainArr.get(mid);
            if(midValue==target){
                return mid;
            }

            if(isAscending){
                if(midValue<target){
                    left=mid+1;
                }
                else{
                    right=mid-1;
                }
            }
            else{
                if(midValue<target){
                    right=mid-1;
                }
                else{
                    left=mid+1;
                }
            }
           
        }
        return -1;
   }




    public int findInMountainArray(int target, MountainArray mountainArr) {
        int l=0;
    int r=mountainArr.length()-1;
    while(l<r){
        int mid=(l+r)/2;
        int midVal=mountainArr.get(mid);
        int midNextVal=mountainArr.get(mid+1);
        if(midVal<midNextVal){
            l=mid+1;
        }
        else{
            r=mid;
        }
    }
        int peakIndex=l;
        int k=binarySearch(mountainArr,target,0,peakIndex,true);
        if(k!=-1){
            return k;
        }
        return binarySearch(mountainArr,target,peakIndex,mountainArr.length()-1,false);
    }
}
*/