/*
Runtime: 0 ms, faster than 100.00% of Java online submissions for Self Crossing.
Memory Usage: 36.9 MB, less than 65.00% of Java online submissions for Self Crossing.
*/

class Solution {
    public boolean isSelfCrossing(int[] x) {
        for (int i = 3; i < x.length; i++) {
            if (x[i] >= x[i - 2] && x[i - 1] <= x[i - 3]) {
                return true;
            }
            if (i >= 4 && x[i] + x[i - 4] >= x[i - 2] && x[i - 1] == x[i-3]) {
                return true;
            }
            if (i >= 5 && x[i - 2] >= x[i - 4] && x[i] + x[i - 4] >= x[i - 2] && x[i - 3] >= x[i - 1] && x[i - 1] + x[i - 5] >= x[i-3]) {
                return true;
            }
        }
        return false;
    }
}