class Solution {
    public long coloredCells(int n) {
      
        return 1+(2*(long)(n-1)*n);
    }
}
  /*  public long coloredCells(int n) {
        long cells=1;
        long t=1;
        while(t<=n){
            cells+=4*(t-1);
            t++;
        }
        return cells;
    }
} */
   /* public long coloredCells(int n) {
        return solve(n);
    }
    public long solve(int n){
    if(n==1){
            return 1;
        }

        return 4*(n-1)+solve(n-1);
    }
}*/