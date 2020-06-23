/*
Runtime: 1 ms, faster than 95.78% of Java online submissions for Powerful Integers.
Memory Usage: 36.8 MB, less than 93.33% of Java online submissions for Powerful Integers.
*/

class Solution {
    public List<Integer> powerfulIntegers(int x, int y, int bound) {
        Set<Integer> pows = new HashSet<>();
        int pow = 0;
        int xp = 1;
        for (int i = 0; xp <= bound; i++) {
            int j = 0;
            do {
                pow = xp + pow(y, j++);
                if (pow <= bound) {
                    pows.add(pow);
                }
            } while (pow <= bound && y != 1);
            if (x == 1) {
                break;
            }
            xp = pow(x, i + 1);
        }
        return new ArrayList<Integer>(pows);
    }
    
    public int pow(int a, int b) {
        if (b <= 0) {
            return 1;
        }
        int p = a;
        while (--b > 0) {
            p *= a;
        }
        return p;
    }
}