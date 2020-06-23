/*
Runtime: 0 ms, faster than 100.00% of Java online submissions for Search Insert Position.
Memory Usage: 38.9 MB, less than 88.58% of Java online submissions for Search Insert Position.
*/

class Solution {
    public int searchInsert(int[] nums, int target) {
        int lo = 0;
        int hi = nums.length - 1;
        int mid = 0;
        while (lo <= hi) {
            mid = (hi + lo) / 2;
            int n = nums[mid];
            if (n < target) {
                lo = mid + 1;
            } else if (n > target) {
                hi = mid - 1;
            } else {
                return mid;
            }
        }
        return lo;
    }
}