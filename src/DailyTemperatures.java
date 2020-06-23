/*
Runtime: 923 ms, faster than 5.61% of Java online submissions for Daily Temperatures.
Memory Usage: 47.8 MB, less than 34.57% of Java online submissions for Daily Temperatures.
*/

class Solution {
    public int[] dailyTemperatures(int[] T) {
        int[] days = new int[T.length];
        for (int i = 0; i < days.length - 1; i++) {
            for (int j = i + 1; j < days.length; j++) {
                if (T[j] > T[i]) {
                    days[i] = j - i;
                    break;
                }
            }
        }
        return days;
    }
}