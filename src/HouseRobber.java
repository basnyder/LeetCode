/*
Runtime: 0 ms, faster than 100.00% of Java online submissions for House Robber.
Memory Usage: 36.9 MB, less than 50.35% of Java online submissions for House Robber.
*/

class Solution {
    public int rob(int[] nums) {
        if (nums.length == 0) {
            return 0;
        } else if (nums.length == 1) {
            return nums[0];
        } else if (nums.length == 2) {
            return Math.max(nums[0], nums[1]);
        }
        int a = 0;
        int b = 0;
        
        for (int i = 0; i < nums.length; i++) {
            if (i % 2 == 0) {
                b = Math.max(a, b + nums[i]);
            } else {
                a = Math.max(a + nums[i], b);
            }
        }
        return Math.max(a,b);
    }

}