class Solution {
    public int[] fairCandySwap(int[] a, int[] b) {
        int sumA=0;
        int sumB=0;
        for(int i=0;i<a.length;i++){
            sumA=sumA+a[i];
        }
        for(int i=0;i<b.length;i++){
            sumB=sumB+b[i];
        }

        int diff=(sumA-sumB)/2;
        HashSet<Integer> seen =new HashSet<>();
        for(int i:a){
            seen.add(i);
        }

        for(int j: b){
            if(seen.contains(j+diff)){
                return new int[]{j+diff,j};
            }
        }
        return null;
    }
}