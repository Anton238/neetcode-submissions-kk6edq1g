class Solution {
    public int[] productExceptSelf(int[] nums) {
        int zeroes = 0;
        int fZ = -1;
        int t = 1;

        for (int i = 0; i < nums.length; i++) {
            var n = nums[i];

            if (n == 0) {
                zeroes++;
                if (fZ == -1) fZ = i;
            } else {
                t *= n;
            }
        }

        var res = new int[nums.length];
        if (zeroes == 1) {
            res[fZ] = t;
            return res;
        }
        if (zeroes >= 2) return res;

        for (int i = 0; i < res.length; i++) {
            res[i] = t / nums[i];
        }

        return res;
    }
}  
