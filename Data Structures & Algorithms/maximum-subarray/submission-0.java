class Solution {
    public int maxSubArray(int[] nums) {
        if (nums.length == 0) return 0;

        int sum = nums[0];
        int curr = nums[0];

        for (int i = 1; i < nums.length; i++) {
            if (curr > 0) {
                curr += nums[i];
            } else {
                curr = nums[i];
            }
            sum = Math.max(curr, sum);
        }
        return sum;
    }
}
