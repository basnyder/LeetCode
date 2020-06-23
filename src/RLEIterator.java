/*
Runtime: 4 ms, faster than 100.00% of Java online submissions for RLE Iterator.
Memory Usage: 39.8 MB, less than 23.13% of Java online submissions for RLE Iterator.
*/

class RLEIterator {
    int curr;
    int[] a;

    public RLEIterator(int[] A) {
        a = A;
        curr = 0;
    }
    
    public int next(int n) {
        while (curr < a.length) {
            a[curr] -= n;
            if (a[curr] >= 0) {
                return a[curr + 1];
            } else {
                n = -a[curr];
                curr += 2;
            }
        }
        return -1;
    }
}

/**
 * Your RLEIterator object will be instantiated and called as such:
 * RLEIterator obj = new RLEIterator(A);
 * int param_1 = obj.next(n);
 */