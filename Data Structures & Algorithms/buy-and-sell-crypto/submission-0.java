class Solution {
    public int maxProfit(int[] prices) {
        int res = 0;
        if (prices.length < 2) return 0;

        for (int l = 0, r = 1; l < prices.length && r < prices.length; r++) {
            res = Math.max(res, prices[r]-prices[l]);

            if (prices[r] < prices[l]) {
                l = r;
            }
        }

        return res;
    }
}
