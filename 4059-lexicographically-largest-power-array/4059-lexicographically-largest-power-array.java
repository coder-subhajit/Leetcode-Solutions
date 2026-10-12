
import java.util.*;

class Solution {
    public int[] largestPower(int[] nums) {
        int[] power = new int[15];

        List<List<Integer>> groups = new ArrayList<>();
        List<Integer> initial = new ArrayList<>();

        for (int num : nums) {
            initial.add(num);
        }
        groups.add(initial);

        for (int bit = 14; bit >= 0; bit--) {
            int count = 0;

            for (int g = 0; g < groups.size(); g++) {
                List<Integer> group = groups.get(g);
                List<Integer> ones = new ArrayList<>();
                List<Integer> zeros = new ArrayList<>();

                for (int num : group) {
                    if ((num & (1 << bit)) != 0) {
                        ones.add(num);
                    } else {
                        zeros.add(num);
                    }
                }

                if (zeros.isEmpty()) {
                    // Every element has this bit set.
                    count += group.size();
                } else {
                    // This is the first group that is not all ones.
                    count += ones.size();

                    if (!ones.isEmpty()) {
                        groups.set(g, ones);
                        groups.add(g + 1, zeros);
                    } else {
                        groups.set(g, zeros);
                    }

                    break;
                }
            }

            power[14 - bit] = count;
        }

        return power;
    }
}
