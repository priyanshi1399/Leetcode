class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
       Stack<Integer> stack=new Stack<>();
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<nums2.length;i++){
            while(!stack.isEmpty() && nums2[stack.peek()]<nums2[i]){ //nums2[0]<3=>1<3
                map.put(nums2[stack.pop()],nums2[i]);
            }
            stack.push(i);
        }

        for(int i=0;i<nums1.length;i++){
            nums1[i]=map.getOrDefault(nums1[i],-1);
        }

        return nums1;

       /* int n=nums2.length;
        Stack<Integer> stck=new Stack<>();
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=n-1;i>=0;i--){          
            while(!stck.isEmpty() && stck.peek()<=nums2[i]){
                stck.pop();
            }
            if(stck.isEmpty()){
                map.put(nums2[i],-1);
            }
            else{
                map.put(nums2[i],stck.peek());
            }
            stck.push(nums2[i]);           
        }
      
    int [] ans=new int[nums1.length];
    for(int i=0;i<nums1.length;i++){
        ans[i]=map.get(nums1[i]);
    }
    return ans;  */

        /*Stack<Integer> s=new Stack<>();
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<nums2.length;i++){
            while(!s.isEmpty() && nums2[s.peek()]<nums2[i]){
                map.put(nums2[s.pop()],nums2[i]);
            }
            s.push(i);
        }
            //1,3,4,2
            //1,3
            //3,4
            //s=[4,2]
            for(int i=0;i<nums1.length;i++){
                nums1[i]=map.getOrDefault(nums1[i],-1);
            }
            return nums1;*/
             /* 1
        /1 will be removed  in map 3,4 */
        }
    }
