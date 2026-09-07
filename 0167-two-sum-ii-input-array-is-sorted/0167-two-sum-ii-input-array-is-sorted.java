class Solution {
    public int[] twoSum(int[] nums, int target) {
       int n=nums.length;
       int left=0;
       int right=n-1;
       while(left<right){
        if(nums[left]+nums[right]==target){
            return new int[] {left+1,right+1};
        }
        else if(nums[left]+nums[right]<target){
            left++;
        }
        else{
            right--;
        }
       }return new int[]{left+1,right+1};
    }
}