/*
Runtime: 1 ms, faster than 100.00% of Java online submissions for Non-negative Integers without Consecutive Ones.
Memory Usage: 36.1 MB, less than 98.05% of Java online submissions for Non-negative Integers without Consecutive Ones.
*/

class Solution {
    List<Integer> list;
    public int findIntegers(int num) {
        int[] f = new int[32];
        f[0] = 1;
        f[1] = 2;
        for (int i = 2; i < f.length; i++) {
            f[i] = f[i - 1] + f[i - 2];
        }
        int i = 30;
        int sum = 0;
        boolean prev = false;
        while (i >= 0) {
            if ((num & (1 << i)) != 0) { // ith bit is a 1
                sum += f[i];
                if (prev) {
                    return sum;
                }
                prev = true;
            } else {
                prev = false;
            }
            i--;
        }
        return sum + 1;
        // if (num < 3) {
        //     return num + 1;
        // }
        // List<Integer> list = new ArrayList<>();
        // list.add(0);
        // list.add(1);
        // for (int i = 1; i < list.size(); i++) {
        //     int n = list.get(i);
        //     if (n * 2 > num) {
        //         break;
        //     }
        //     list.add(n * 2); //add x & '0'
        //     if (n % 2 == 0 && n * 2 + 1 <= num) { //ends with 0
        //         list.add(n * 2  + 1); //adds x & '1'
        //     }
        // }
        // return list.size();//maybe do recursively?
    }
    
    public boolean works(int i) {
        int curr = i % 2;
        int next = 0;
        int mask = 2;
        while (mask < i) {
            next = i & mask;
            if (curr != 0 && next != 0) {
                return false;
            }
            curr = next;
            mask *= 2;
        }
        return true;
    }
}