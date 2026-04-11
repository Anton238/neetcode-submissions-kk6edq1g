class Solution {
    public int longestConsecutive(int[] nums) {
        var set = new HashSet<Integer>();

        for (var num : nums) {
            set.add(num);
        }

        int res = 0;

        for (var num : set) {
            if (set.contains(num-1)) continue;

            int length = 1;
            
            while (set.contains(num + length)) {
                length++;
            }

            res = Math.max(length, res);

        }

        return res;
    }
}
