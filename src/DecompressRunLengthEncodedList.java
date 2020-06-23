/*
Runtime: 1 ms, faster than 95.07% of Java online submissions for Decompress Run-Length Encoded List.
Memory Usage: 39.6 MB, less than 98.49% of Java online submissions for Decompress Run-Length Encoded List.
*/

class Solution {
    public int[] decompressRLElist(int[] nums) {
        int length = 0;
        for (int i = 0; i < nums.length; i += 2) {
            length += nums[i];
        }
        int[] out = new int[length];
        int index = 0;
        int i = 0;
        while (i < length && index < nums.length / 2) {
            for (int j = 0; j < nums[2 * index]; j++) {
                out[i++] = nums[index * 2 + 1];
            }
            index++;
        }
        return out;
    }
}