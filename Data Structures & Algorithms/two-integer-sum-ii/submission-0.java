class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int f = 0, l = numbers.length-1;

        while (f < l) {
            var sum = numbers[f] + numbers[l];
            if (sum == target) return new int[] {f+1,l+1};

            if (sum < target) f++;
            else l--;
        }

        return new int[] {-1,-1};
    }
}
