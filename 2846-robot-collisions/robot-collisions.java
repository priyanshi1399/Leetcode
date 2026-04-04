class Solution {
    public List<Integer> survivedRobotsHealths(int[] positions, int[] healths, String directions) {
        int n=positions.length;
        Integer [] indices=new Integer[n];

        for(int i=0;i<n;i++){
            indices[i]=i;
        }

        Arrays.sort(indices,(a,b)->Integer.compare(positions[a],positions[b]));
        
        Stack<Integer> stck=new Stack<>();
        for(int curr_index:indices){
            if(directions.charAt(curr_index)=='R'){
                stck.push(curr_index);
            }
            else{
                while(!stck.isEmpty() && healths[curr_index]>0){
                    int top_index=stck.pop();
                    if(healths[top_index]>healths[curr_index]){
                        healths[top_index]-=1;
                        healths[curr_index]=0;
                        stck.push(top_index);
                    }
                    else if(healths[top_index]<healths[curr_index]){
                        healths[curr_index]-=1;
                        healths[top_index]=0;
                    }
                    else{
                        healths[curr_index]=0;
                        healths[top_index]=0;
                    }
                }
            }
        }
        List<Integer> result=new ArrayList<>();

        for(int num:healths){
            if(num>0){
                result.add(num);
            }
        }
        return result;
    }


}