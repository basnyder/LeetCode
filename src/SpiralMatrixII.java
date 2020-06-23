/*
Runtime: 0 ms, faster than 100.00% of Java online submissions for Spiral Matrix II.
Memory Usage: 37.2 MB, less than 75.02% of Java online submissions for Spiral Matrix II.
*/

class Solution {
    public int[][] generateMatrix(int n) {
        int[][] out = new int[n][n];
        if (n == 1) {
            out[0][0] = 1;
            return out;
        }
        int count = 1;
        int i = 0;//ud
        int j = 0;//lr
        int len = n - 1;
        while (count < n * n) {
            for (int k = 0; k < len; k++) {
                out[i][j++] = count++;
            }
            for (int k = 0; k < len; k++) {
                out[i++][j] = count++;
            }
            for (int k = 0; k < len; k++) {
                out[i][j--] = count++;
            }
            for (int k = 0; k < len; k++) {
                out[i--][j] = count++;
            }
            i++;
            j++;
            len -= 2;
        }
        if (n % 2 == 1) {
            out[i][j] = count;
        }
        return out;
    }
}