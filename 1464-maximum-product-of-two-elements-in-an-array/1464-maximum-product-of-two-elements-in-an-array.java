class Solution {
    public int maxProduct(int[] nums) {
        int largest=0;
        int secondLargest=0;
        for(int n : nums){
            if(n>largest){
                secondLargest=largest;
                largest=n;
            } else if(n>secondLargest){
                secondLargest=n;
            }
        } return (largest-1)*(secondLargest-1);
    }
}