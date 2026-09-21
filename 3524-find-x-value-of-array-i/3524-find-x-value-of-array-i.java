class Solution {
    public long[] resultArray(int[] nums, int k) {

    long[] ans=new long[k];
    long[] dp=new long[k];

    for(int num : nums){
        int rem=num%k;

    long[] newDp=new long[k];

    newDp[rem]=1;

    for(int r=0;r<k;r++){
        int newRem=(r*rem)%k;

        newDp[newRem]+=dp[r];
    }    
    for(int r=0;r<k;r++){
        ans[r]+=newDp[r];
    }
    dp=newDp;
    }     
      return ans;
    }
}