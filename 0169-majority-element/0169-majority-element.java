class Solution {
    public int majorityElement(int[] nums) {
       int elm=0;
       int count=0;
       for(int num : nums){
        if(count==0){
            elm=num;
        }
        if(num==elm){
            count++;
        }else{
        count--;
       }
       }
       count=0;
       for(int num : nums){
        if(num==elm){
            count++;
        }
       }
        if(count>nums.length/2){
            return elm;
        }else{
            return -1;
        }
    }
}