class Solution {
    public int[] sortedSquares(int[] nums) {
       int n=nums.length;
       int[] ans=new int[n];
       int left=0;
       int right=n-1;
       int index=n-1;
       while(left<=right){
        int lefts=nums[left]*nums[left];
        int rights=nums[right]*nums[right];
        if(lefts>rights){
            ans[index]=lefts;
            left++;
        } else{
            ans[index]=rights;
            right--;
        }index--;
       }  return ans;
    }
}