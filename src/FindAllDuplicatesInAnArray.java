/*
Runtime: 60 ms, faster than 5.04% of Java online submissions for Find All Duplicates in an Array.
Memory Usage: 77.2 MB, less than 5.01% of Java online submissions for Find All Duplicates in an Array.
*/

class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        List<Integer> list = new ArrayList<>(nums.length);
        Map<Integer, Integer> map = new HashMap<>(nums.length);
        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], 1 + map.getOrDefault(nums[i], 0));
        }
        for (Map.Entry<Integer, Integer> e : map.entrySet()) {
            if (e.getValue() == 2) {
                list.add(e.getKey());
            }
        }
        return list;
    }
}