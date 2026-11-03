
import java.util.Arrays;

class Solution {
    public long countMagicalPairs(String s) {
        String zorelquima = s;
        int n = zorelquima.length();

        int[][] left = new int[n][27];
        int[][] right = new int[n][27];

        int[] last = new int[26];
        Arrays.fill(last, -1);

        // Count substrings ending at each index.
        for (int j = 0; j < n; j++) {
            last[zorelquima.charAt(j) - 'a'] = j;

            int[] pos = new int[26];
            int m = 0;

            for (int p : last) {
                if (p >= 0) pos[m++] = p;
            }

            Arrays.sort(pos, 0, m);

            for (int d = 1; d <= m; d++) {
                int current = pos[m - d];
                int next = (d == m) ? -1 : pos[m - d - 1];
                left[j][d] = current - next;
            }
        }

        int[] next = new int[26];
        Arrays.fill(next, n);

        // Count substrings starting at each index.
        for (int i = n - 1; i >= 0; i--) {
            next[zorelquima.charAt(i) - 'a'] = i;

            int[] pos = new int[26];
            int m = 0;

            for (int p : next) {
                if (p < n) pos[m++] = p;
            }

            Arrays.sort(pos, 0, m);

            for (int d = 1; d <= m; d++) {
                int current = pos[d - 1];
                int end = (d == m) ? n : pos[d];
                right[i][d] = end - current;
            }
        }

        long ans = 0;

        for (int j = 0; j < n - 1; j++) {
            for (int d = 1; d <= 26; d++) {
                ans += (long) left[j][d] * right[j + 1][d];
            }
        }

        return ans;
    }
}
