class Solution {
    public long countSubarrays(int[] nums, int minK, int maxK) {
        int n = nums.length;
        int left = 0;
        long count = 0;

        int[] vornelqixa = nums.clone();

        for (int right = 0; right < n; right++) {
            if (vornelqixa[right] < minK || vornelqixa[right] > maxK) {
                left = right + 1;
            } else {
                count += right - left + 1;
            }
        }

        return count;
    }
}
