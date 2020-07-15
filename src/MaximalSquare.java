/*
Runtime: 4 ms, faster than 90.73% of Java online submissions for Maximal Square.
Memory Usage: 42.6 MB, less than 71.73% of Java online submissions for Maximal Square.
*/

class Solution {
    public int maximalSquare(char[][] matrix) {
        if (matrix.length == 0 || matrix[0].length == 0) {
            return 0;
        }
        int max = 0;
        int[][] dp = new int[matrix.length][matrix[0].length];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] == '1') {
                    if (max == 0) {
                        max = 1;
                    }
                    int up = (i > 0) ? dp[i-1][j] : 0;
                    int lf = (j > 0) ? dp[i][j-1] : 0;
                    int ul = (i > 0 && j > 0) ? dp[i-1][j-1] : 0;
                    dp[i][j] = 1 + Math.min(Math.min(up, lf), ul);
                    if (dp[i][j] > max) {
                        max = dp[i][j];
                    }
                }
            }
        }
        return max * max;
    }
}