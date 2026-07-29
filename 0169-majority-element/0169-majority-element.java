//Moore's Voting Algo...
class Solution {
    public int majorityElement(int[] nums) {
        int count=0;
        int element=0;
        for(int num : nums){
            if(count==0){
                element=num;
            }
            if(num==element){
                count++;
            }else{
                count--;
            }
        }
        count=0;
        for(int num : nums){
            if(num==element){
                count++;
            } 
            if(count>nums.length/2){
                return element;
            }
        } return -1;
    }
}
