/*
Runtime: 0 ms, faster than 100.00% of Java online submissions for Sort Colors.
Memory Usage: 37.9 MB, less than 65.30% of Java online submissions for Sort Colors.
*/

class Solution {
    public void sortColors(int[] nums) {
        int[] colors = new int[3];
        for (int i = 0; i < nums.length; ++i) {
            ++colors[nums[i]];
        }
        int i = 0;
        while (colors[0]-- > 0) {
            nums[i++] = 0;
        }
        while (colors[1]-- > 0) {
            nums[i++] = 1;
        }
        while (colors[2]-- > 0) {
            nums[i++] = 2;
        }
    }
}