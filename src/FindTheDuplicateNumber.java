/*
Runtime: 2 ms, faster than 48.68% of Java online submissions for String Matching in an Array.
Memory Usage: 40.5 MB, less than 25.73% of Java online submissions for Find the Duplicate Number.
*/

class Solution {
    public int findDuplicate(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(nums[i])) {
                return nums[i];
            }
            map.put(nums[i], 1);
        }
        return -1;
    }
}