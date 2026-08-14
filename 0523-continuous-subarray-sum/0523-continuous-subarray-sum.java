import java.util.*;

class Solution {
    public boolean checkSubarraySum(int[] nums, int k) {

        // Special case: k = 0
        if (k == 0) {
            for (int i = 1; i < nums.length; i++) {
                if (nums[i] == 0 && nums[i - 1] == 0) {
                    return true;
                }
            }
            return false;
        }

        HashMap<Integer, Integer> map = new HashMap<>();

        map.put(0, -1);

        int remainder = 0;

        for (int i = 0; i < nums.length; i++) {

            remainder = (remainder + nums[i]) % k;

            if (map.containsKey(remainder)) {

                if (i - map.get(remainder) >= 2) {
                    return true;
                }

            } else {
                map.put(remainder, i);
            }
        }

        return false;
    }
}