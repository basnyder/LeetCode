/*
Runtime: 0 ms
Memory Usage: 39.4 MB
*/

class Solution {
    public int[] plusOne(int[] digits) {
        for (int i = digits.length - 1; i >= 0; i--) {
            if (digits[i] == 9) {
                digits[i] = 0;
            } else {
                digits[i]++;
                return digits;
            }
        }
        int[] nd = new int[digits.length + 1];
        nd[0] = 1;
        for (int i = 0; i < digits.length; i++) {
            nd[i + 1] = digits[i];
        }
        return nd;
    }
}