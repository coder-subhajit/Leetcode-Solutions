class Solution {
    public int pivotIndex(int[] nums) {
        //calculate total sum
        int totalSum=0;
        for(int n : nums){
         totalSum+=n;
        }
        //traverse the array
        int leftSum=0;
        for(int i=0;i<nums.length;i++){
            int rightSum=totalSum-leftSum-nums[i];

            if(leftSum==rightSum){
                return i;
            }
            leftSum+=nums[i];
        }
      return -1;
    }
}