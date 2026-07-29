class Solution {
    public List<Integer> majorityElement(int[] nums) {
     int element1=0;
     int element2=0;
     int count1=0;
     int count2=0;
     //find two majority element
     for(int num : nums){
        if(num==element1){
            count1++;
        }else if(num==element2){
            count2++;
        }else if(count1==0&&num!=element2){
            element1=num;
            count1=1;
        }else if(count2==0&&num!=element1){
            element2=num;
            count2=1;
        }
        else{
            count1--;
            count2--;
        }
     }
        //check the conditions
        count1=0;
        count2=0;
        for(int num : nums){
            if(num==element1){
                count1++;
            }else if(num==element2){
                count2++;
            }  
        }
       ArrayList<Integer>ans=new ArrayList<>();
       if(count1>nums.length/3){
        ans.add(element1);
       }
       if(count2>nums.length/3){
        ans.add(element2);
       } return ans;
    }
}