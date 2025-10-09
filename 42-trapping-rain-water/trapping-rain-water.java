class Solution {
    public int trap(int[] height) {
        int n=height.length;
        int [] leftMax=new int[n];
        leftMax[0]=height[0]; //left side maximum
        for(int i=1;i<n;i++){
            leftMax[i]=Math.max(leftMax[i-1],height[i]);
        }

        int [] rightMax=new int[n]; //right side maximum
        rightMax[n-1]=height[n-1];
        for(int i=n-2;i>=0;i--){
            rightMax[i]=Math.max(rightMax[i+1],height[i]);
        }
        //water will fill in between leftMax & rightMax but within min of them
        int totalWater=0;
        
        for(int i=0;i<n;i++){
            //water will be at the top of the building So we have to subtract the height of the building
            totalWater+=Math.min(leftMax[i],rightMax[i])-height[i]; 
        }
        return totalWater;


    }
}


//[0,1,1,2,2,2,2,3,3,3,3,3]
//[3,3,3,3,3,3,3,3,2,2,2,1]

