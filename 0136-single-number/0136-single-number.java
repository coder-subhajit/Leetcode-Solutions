class Solution {
    public int singleNumber(int[] nums) {
    int XorResult=0;
    for(int num : nums){
        XorResult^=num;
    }    return XorResult;
    }
}