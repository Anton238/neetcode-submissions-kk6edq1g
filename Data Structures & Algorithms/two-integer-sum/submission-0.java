class Solution {
    public int[] twoSum(int[] nums, int target) {
        var map = new HashMap<Integer, Integer>();

        for (int i = 0; i < nums.length; i++) {
            
            if (map.get(nums[i]) != null) {
                return new int[] {map.get(nums[i]), i};
            }

            map.put(target - nums[i], i);
        }

        return new int[] {-1,-1};
    }
}
