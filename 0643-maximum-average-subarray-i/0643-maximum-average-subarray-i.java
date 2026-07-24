class Solution {
    public double findMaxAverage(int[] nums, int k) {
    int n=nums.length;
    int l=0;
    int r=k-1;
    int sum=0;
    while(l<=r){
     sum+=nums[l];
     l++;
    }
    l=0;
    int maxSum=sum;
    while(r<n-1){
        sum=sum-nums[l];
        l++;
        r++;
        sum=sum+nums[r];
        maxSum=Math.max(maxSum,sum);
    }return (double)maxSum/k;
    }
}