import java.util.Arrays;
class Solution {
    public int maximumProduct(int[] nums) {
     Arrays.sort(nums);
     int maxProduct=0;
      int op1=nums[nums.length-3]*nums[nums.length-2]*nums[nums.length-1];
      int op2=nums[0]*nums[1]*nums[nums.length-1];
      maxProduct=Math.max(op1,op2);
      return maxProduct;

    }
}