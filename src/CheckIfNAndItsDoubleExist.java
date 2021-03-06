/*
Runtime: 3 ms, faster than 28.91% of Java online submissions for Check If N and Its Double Exist.
Memory Usage: 40.5 MB, less than 15.17% of Java online submissions for Check If N and Its Double Exist.
*/

class Solution {
    public boolean checkIfExist(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (i == j) {
                    continue;
                }
                if (arr[i] == 2 * arr[j] || arr[j] == 2 * arr[i]) {
                    return true;
                }
            }
        }
        return false;
    }
}