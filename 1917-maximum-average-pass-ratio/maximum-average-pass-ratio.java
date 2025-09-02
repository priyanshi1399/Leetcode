class Solution {
    public double maxAverageRatio(int[][] classes, int extraStudents) {
        int n=classes.length;
        PriorityQueue<double []> pq=new PriorityQueue<>((a,b)->Double.compare(b[0],a[0])); //maxHeap

        for(int i=0;i<n;i++){
            double ratio=(double)classes[i][0]/classes[i][1];
            double newRatio=(double)(classes[i][0]+1)/(classes[i][1]+1);
            double delta=newRatio-ratio;
            pq.add(new double[]{delta,i}); //insert for checking one student
        }

        double bestDelta=0.0;
        int bestIndex=0;
        
        while(extraStudents-->0){
            double [] curr=pq.poll();
            bestIndex=(int) curr[1];

            classes[bestIndex][0]++; //completed for one more student
            classes[bestIndex][1]++;

                double ratio=(double)classes[bestIndex][0]/classes[bestIndex][1];
                double newRatio=(double)(classes[bestIndex][0]+1)/(classes[bestIndex][1]+1);
                double delta=newRatio-ratio;

                pq.add(new double[]{delta,bestIndex}); //insert index for same class

            
        }
    double sum=0.0;
    for(int i=0;i<n;i++){
        sum+=(double)classes[i][0]/classes[i][1];
    }

    return sum/n;
}
}