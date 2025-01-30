
class Solution {
    public int[][] merge(int[][] intervals) {

        Stack<int []> stck=new Stack<>();
        Arrays.sort(intervals,(a,b)->Integer.compare(a[0],b[0]));
        for(int i=0;i<intervals.length;i++){
            if(!stck.isEmpty() && stck.peek()[1]>=intervals[i][0]){
                int value1=stck.peek()[0];
                int value2=stck.peek()[1];
                stck.pop();
                stck.push(new int[]{value1,Math.max(value2,intervals[i][1])});
            }
            else{
                stck.push(new int[]{intervals[i][0],intervals[i][1]});
            }

        }

        int i=0;
        int [][]ans=new int[stck.size()][2];
        while(!stck.isEmpty()){
            ans[i][0]=stck.peek()[0];
            ans[i][1]=stck.peek()[1];
            stck.pop();
            i++;
        }
        return ans;
    }
}
    /*public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals,(a,b)->Integer.compare(a[0],b[0]));
        List<int []> res=new ArrayList<>();
        for(int [] i:intervals){
            if(res.isEmpty() || res.getLast()[1]<i[0]){
                res.add(i);
            }
            else{
                res.getLast()[1]=Math.max(res.getLast()[1],i[1]);
            }
        }
        /*int j=0;
        int [][] ans=new int[res.size()][2];
        for(int [] i:res){
            ans[j][0]=i[0];
            ans[j][1]=i[1];
            j++;
        }*/
        /*
        int [][] ans=new int[res.size()][2];
        for(int i=0;i<res.size();i++){
            int [] temp=res.get(i);
            for(int j=0;j<2;j++){
                ans[i][j]=temp[j];
            }
        }


        return ans;
    }
}*/