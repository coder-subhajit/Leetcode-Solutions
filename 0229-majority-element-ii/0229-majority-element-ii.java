class Solution {
    public List<Integer> majorityElement(int[] nums) {
     //Brute force
     List<Integer>ans=new ArrayList<>();
     //count the frequency
     for(int i=0;i<nums.length;i++){
        int count=0;
        for(int j=0;j<nums.length;j++){
            if(nums[i]==nums[j]){
                count++;
            }
        } 
        //check the condition
        if(count>nums.length/3 && !ans.contains(nums[i])){
            ans.add(nums[i]);
        }
     }   return ans;
    }
}