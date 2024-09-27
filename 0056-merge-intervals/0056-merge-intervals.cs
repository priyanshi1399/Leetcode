public class Solution {
    public int[][] Merge(int[][] intervals) {

        List<int[]> res=new List<int[]>();
        Array.Sort(intervals, (int[] a, int[]b)=>a[0]-b[0]);

        for(int i=0;i<intervals.Length;i++){
            if(res.Count==0 || res[res.Count-1][1]<intervals[i][0]){
                res.Add(intervals[i]);
            }
            else{
                res[res.Count-1][1]=Math.Max(intervals[i][1],res[res.Count-1][1]);
            }
        }

        int [][] result=new int[res.Count][];
        for(int i=0;i<res.Count;i++){
            result[i]=new int[2];

            result[i][0]=res[i][0];
            result[i][1]=res[i][1];
        }
        return result;
        }
        
    }
