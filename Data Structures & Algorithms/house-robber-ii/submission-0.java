class Solution {
    public int rob(int[] nums) {
        if (nums.length == 0) return 0;
        if (nums.length == 1) return nums[0];
        if (nums.length == 2) return Math.max(nums[0], nums[1]);
        var max1 = 0;
        var max2 = 0;

        int h1 = nums[0];
        int h2 = Math.max(nums[1], nums[0]);

        for (int i = 2; i < nums.length-1; i++) {
            var tmp = Math.max(h1 + nums[i], h2);
            h1 = h2;
            h2 = tmp;
        }

        max1 = h2;

         h1 = nums[1];
         h2 = Math.max(nums[2], nums[1]);

        for (int i = 3; i < nums.length; i++) {
            var tmp = Math.max(h1 + nums[i], h2);
            h1 = h2;
            h2 = tmp;
        }

        max2 = h2;

        return Math.max(max1, max2);
    }
}
