
class Solution {
    public long minSumSquareDiff(int[] nums1, int[] nums2, int k1, int k2) {
        int n = nums1.length;
        long k = (long) k1 + k2;

        int[] diff = new int[n];
        int max = 0;

        for (int i = 0; i < n; i++) {
            diff[i] = Math.abs(nums1[i] - nums2[i]);
            max = Math.max(max, diff[i]);
        }

        long total = 0;
        for (int d : diff) {
            total += d;
        }

        if (k >= total) {
            return 0;
        }

        int left = 0, right = max;

        while (left < right) {
            int mid = left + (right - left) / 2;
            long needed = 0;

            for (int d : diff) {
                if (d > mid) {
                    needed += d - mid;
                }
            }

            if (needed <= k) {
                right = mid;
            } else {
                left = mid + 1;
            }
        }

        int threshold = left;
        long used = 0;
        long ans = 0;

        for (int d : diff) {
            int reduced = Math.min(d, threshold);
            used += d - reduced;
            ans += (long) reduced * reduced;
        }

        long remaining = k - used;

        // Reduce remaining differences from threshold to threshold - 1.
        for (int d : diff) {
            if (remaining == 0) break;

            if (d >= threshold && threshold > 0) {
                ans -= (long) threshold * threshold
                     - (long) (threshold - 1) * (threshold - 1);
                remaining--;
            }
        }

        return ans;
    }
}