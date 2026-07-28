//optimized but not optimal.For optimal solution use DNF(Dutch National Flag) algo...
class Solution {
    public void sortColors(int[] nums) {
     int n=nums.length;
     int count_0=0;
     int count_1=0;
     int count_2=0;
     for(int i=0;i<n;i++){
        if(nums[i]==0){
            count_0++;
        }else if(nums[i]==1){
            count_1++;
        }else{
            count_2++;
        }  
     }
     int index=0;
     for(int i=0;i<count_0;i++){
        nums[index++]=0;
     }   
     for(int i=0;i<count_1;i++){
        nums[index++]=1;
     }
     for(int i=0;i<count_2;i++){
        nums[index++]=2;
    } 
 } 
}
