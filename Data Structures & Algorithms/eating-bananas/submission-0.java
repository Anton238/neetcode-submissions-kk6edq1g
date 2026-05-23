class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        if (piles.length > h) return -1;
        
        int max = 0;

        for (var n : piles) {
            max = Math.max(n, max);
        }

        int min = 1, res = -1;

        boolean fit = false;

        int res2 = -1;

        while (min <= max) {
            res = (max + min) / 2;

            fit = fit(piles, h, res);

            if (fit) {
                res2 = res;
                max = res-1;
            } else {
                min = res+1;
            }
        }

        return res2;
    }

    boolean fit(int[] piles, int h, int k) {
        long e = 0;

        for (var n : piles) {
            if (n <= k) e += 1;
            else e += n % k == 0 ? n / k : n/k + 1;
        }

        return e <= h;
    }
}
