/*
Runtime: 92 ms, faster than 14.93%
Memory Usage: 43.3 MB, less than 94.80%
*/

class Solution {
    private static Random random = new Random();
      private int[] w;
      private int sum;
      public Solution(int[] w) {
          this.w = w;
          for(int num : w) this.sum += num;
      }
        
      public int pickIndex() {
          int rand = random.nextInt(sum) + 1;
          int temp = 0;
          for(int i = 0; i < w.length; i++){
              if(temp + w[i] >= rand) return i;
              temp += w[i];
          }
          return w.length - 1;
      }
}

/**
 * Your Solution object will be instantiated and called as such:
 * Solution obj = new Solution(w);
 * int param_1 = obj.pickIndex();
 */