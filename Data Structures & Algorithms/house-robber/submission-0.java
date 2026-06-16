class Solution {
    public int rob(int[] nums) {
                if (nums.length == 0) return 0;

        if (nums.length == 1) return nums[0];

        int h1 = nums[0];
        int h2 = Math.max(h1, nums[1]);

        for (int i = 2; i < nums.length; i++) {
            var b = Math.max(h1 + nums[i], h2);
            h1 = h2;
            h2 = b;
        }

        return h2;
    }
}
