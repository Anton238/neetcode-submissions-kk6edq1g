class Solution {
    public boolean hasDuplicate(int[] nums) {
        var map = new HashSet<Integer>();

        for (int n : nums) {
            if (map.contains(n)) return true;

            map.add(n);
        }
        return false;
    }
}