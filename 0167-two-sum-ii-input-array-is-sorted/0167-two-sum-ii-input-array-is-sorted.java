class Solution {
    public int[] twoSum(int[] numbers, int target) {
       int n=numbers.length;
       for(int i=0;i<n;i++){
        for(int j=n-1;j>i;j--){
            if(target==numbers[i]+numbers[j]){
                return new int[]{i+1,j+1};
            }
        }
       } return new  int[]{};
    } 
}