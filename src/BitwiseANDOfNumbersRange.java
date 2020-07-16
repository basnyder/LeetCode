/*
Runtime: 7 ms, faster than 30.47% of Java online submissions for Bitwise AND of Numbers Range.
Memory Usage: 40.9 MB, less than 16.46% of Java online submissions for Bitwise AND of Numbers Range.
*/

class Solution {
    public int rangeBitwiseAnd(int m, int n) {
        if (m == n) {
            return m;
        }
        if ((int)(Math.log10(m) / Math.log10(2)) != (int)(Math.log10(n) / Math.log10(2))) {
            return 0;
        }
        for (int i = (int)(Math.log10(m) / Math.log10(2)); i >= 0; i--) {
            if (m >> i != n >> i) {
                return (m >> i) << i;
            }
        }
        return 0;
        // int and = m;
        // for (int i = m + 1; i <= n; i++) {
        //     and &= i;
        // }
        // return and;
    }
}