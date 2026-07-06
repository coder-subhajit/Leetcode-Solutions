class Solution {
    public int lengthOfLongestSubstring(String s) {
        int n = s.length();
        int maxLen = 0;

        for (int i = 0; i < n; i++) {
            int[] hash = new int[256];

            for (int j = i; j < n; j++) {
                char ch = s.charAt(j);

                if (hash[ch] == 1) {
                    break;
                }

                int len = j - i + 1;
                maxLen = Math.max(maxLen, len);

                hash[ch] = 1;
            }
        }

        return maxLen;
    }
}