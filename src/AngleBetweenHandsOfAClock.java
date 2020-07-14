/*
Runtime: 0 ms
Memory Usage: 38.5 MB
*/

class Solution {
    public double angleClock(int hour, int minutes) {
        double hb = hour * 30 + minutes * 0.5;
        double mb = minutes * 6;
        return Math.min(Math.min(Math.abs(hb - mb), (hb + 360 - mb)), (mb + 360 - hb));
    }
}