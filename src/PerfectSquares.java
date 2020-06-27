/*
Runtime: 33 ms, faster than 62.79% of Java online submissions for Perfect Squares.
Memory Usage: 39 MB, less than 45.88% of Java online submissions for Perfect Squares.
*/

class Solution {
    public int numSquares(int n) {
        if (n <= 3) {
            return n;
        }
        
        int[] nums = new int[n + 1];
        for (int i = 0; i < 4; i++) {
            nums[i] = i;
        }
        for (int i = 4; i <= n; i++) {
            nums[i] = i;
            for (int x = 1; x * x <= i; x++) {
                nums[i] = Math.min(nums[i], 1 + nums[i - x * x]);
            }
        }
        return nums[n];

    }
}