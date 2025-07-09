class Solution {
    public int largestRectangleArea(int[] heights) {
        Stack<Integer> stck=new Stack<>();
        int n=heights.length;
        int nse,pse;
        int maxArea=0;
        for(int i=0;i<n;i++){
            while(!stck.isEmpty() && heights[stck.peek()]>=heights[i]){
                //when you kick out the elemen you have found next smaller to it and if stck is not empty the its prev will be that element
                int index=stck.pop(); //the element index whcih you are popping out

                //write the nse and pse for that

                nse=i;
                pse=stck.isEmpty()?-1:stck.peek();
                //index is that element
                maxArea=Math.max(maxArea,heights[index]*(nse-pse-1));
            }

            stck.push(i);
        }
        //what if out stack has some elements we have not touched those elements

        while(!stck.isEmpty()){
            int index=stck.pop();

            nse=n; //no next smaller
            pse=stck.isEmpty()?-1:stck.peek();
            maxArea=Math.max(maxArea,heights[index]*(nse-pse-1));
        }
        return maxArea;



    }
}