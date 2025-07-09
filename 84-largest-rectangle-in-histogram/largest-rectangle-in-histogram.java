class Solution {
    public int [] previousSmaller(int [] heights){
        int n=heights.length;
        int [] pse=new int[n];
        Stack<Integer> stck=new Stack<>();
        for(int i=0;i<n;i++){
            while((!stck.isEmpty()) && (heights[stck.peek()]>=heights[i])){
                stck.pop();
            }

            pse[i]=stck.isEmpty()?-1:stck.peek(); //index 
            stck.push(i);
        }
        return pse;
    }

     public int [] nextSmaller(int [] heights){
        int n=heights.length;
        int [] nse=new int[n];
        Stack<Integer> stck=new Stack<>();
        for(int i=n-1;i>=0;i--){
            while(!stck.isEmpty() && heights[stck.peek()]>=heights[i]){
                stck.pop();
            }

            nse[i]=stck.isEmpty()?n:stck.peek(); //index 
            stck.push(i);
        }
        return nse;
    }
    public int largestRectangleArea(int[] heights) {
        int n=heights.length;
        int [] pse=previousSmaller(heights);
        int [] nse=nextSmaller(heights);
        int maxArea=Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            maxArea=Math.max(maxArea,(heights[i]*(nse[i]-pse[i]-1)));
        }
        return maxArea;
    }
}