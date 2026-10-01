class Solution {
    public int search(int[] nums, int target) {
      //it only works on sorted array
      int low=0;
      int high=nums.length-1;

      while(low<=high){
        int mid=low+(high-low)/2;

        if(nums[mid]==target){
            return mid;
        }
        else if(nums[mid]<target){
            low=mid+1;
        }
        else{
            high=mid-1;
        }
      }
       return -1;
    }
}