/*
Runtime: 191 ms, faster than 10.95% of Java online submissions for Insert Delete GetRandom O(1).
Memory Usage: 43.1 MB, less than 99.63% of Java online submissions for Insert Delete GetRandom O(1).
*/

class RandomizedSet {
    List<Integer> list;
    Random rand;
    
    /** Initialize your data structure here. */
    public RandomizedSet() {
        list = new ArrayList<>();
        rand = new Random();
    }
    
    /** Inserts a value to the set. Returns true if the set did not already contain the specified element. */
    public boolean insert(int val) {
        if (!list.contains(val)) {
            return list.add(val);
        }
        return false;
    }
    
    /** Removes a value from the set. Returns true if the set contained the specified element. */
    public boolean remove(int val) {
        return list.remove((Integer)val);
    }
    
    /** Get a random element from the set. */
    public int getRandom() {
        return list.get(rand.nextInt(list.size()));
    }
}

/**
 * Your RandomizedSet object will be instantiated and called as such:
 * RandomizedSet obj = new RandomizedSet();
 * boolean param_1 = obj.insert(val);
 * boolean param_2 = obj.remove(val);
 * int param_3 = obj.getRandom();
 2
 */