class Solution {
    public int maxArea(int[] h) {
        int res = 0;
        int l = 0, r = h.length-1;

        while (l < r) {
            res = Math.max(res, (r-l)*Math.min(h[r],h[l]));

            if (h[l] > h[r]) {
                r--;
            } else {
                l++;
            }
        }

        return res;
    }
}
