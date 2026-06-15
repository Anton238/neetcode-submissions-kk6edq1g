class Solution {
    public int minCostClimbingStairs(int[] cost) {
        if (cost.length == 1) return cost[0];

        int[] dp = new int[cost.length+1];


        for (int i = 2; i < dp.length; i++) {
            var f = dp[i-1];
            var s = dp[i-2];

            int sum = 0;

            if (f + cost[i-1] < s + cost[i-2]) {
                dp[i] = f + cost[i-1];
            } else {
                 dp[i] = s + cost[i-2];
            }
        }

        return dp[dp.length-1];
    }
}
