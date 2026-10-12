
class Solution {
    public long maxValue(int[] nums) {
        int n = nums.length;

        long[] prefix = new long[n + 1];

        // Alternating prefix sum
        for (int i = 0; i < n; i++) {
            if (i % 2 == 0) {
                prefix[i + 1] = prefix[i] + nums[i];
            } else {
                prefix[i + 1] = prefix[i] - nums[i];
            }
        }

        long base = prefix[n];

        // Maximum prefix[l] and prefix[l + 1],
        // separated by the parity of l.
        long[] maxP = {
            Long.MIN_VALUE, Long.MIN_VALUE
        };
        long[] maxNext = {
            Long.MIN_VALUE, Long.MIN_VALUE
        };

        long ans = base;

        for (int r = 1; r < n; r++) {
            int l = r - 1;
            int parity = l % 2;

            maxP[parity] = Math.max(
                maxP[parity], prefix[l]
            );

            maxNext[parity] = Math.max(
                maxNext[parity], prefix[l + 1]
            );

            long best = Math.max(
                maxNext[r % 2],
                maxP[1 - (r % 2)]
            );

            long gain = 2L * (best - prefix[r + 1]);

            ans = Math.max(ans, base + gain);
        }

        return ans;
    }
}
