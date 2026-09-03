class Solution {
    public int maxArea(int[] nums) {
    int width=0;
    int height=0;
    int MaxArea=0;
    int left=0;
    int right=nums.length-1;

    while(left<right){
        width=right-left;
        height=Math.min(nums[left],nums[right]);
        int area=width*height;
        if(nums[left]<nums[right]){
        left++;
        }
        else{
        right--;
        }
        MaxArea=Math.max(MaxArea,area);
    }    
    return MaxArea;
    }
}
