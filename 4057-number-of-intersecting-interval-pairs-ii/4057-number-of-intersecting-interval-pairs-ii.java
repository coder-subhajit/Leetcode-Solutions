import java.util.Arrays;
class Solution {
    public long countIntersectingIntervals(int[][] intervals) {
        int n=intervals.length;

        int[] starts=new int[n];
        int[] ends=new int[n];

        for(int i=0;i<n;i++){
            starts[i]=intervals[i][0];
            ends[i]=intervals[i][1];
        }
        Arrays.sort(starts);
        Arrays.sort(ends);

        long total=(long) n*(n-1)/2;
        int j=0;

        for(int start : starts){

        while(j<n&&ends[j]<start){
            j++;
        }
        total-=j;
    }
    return total;
    }  
}