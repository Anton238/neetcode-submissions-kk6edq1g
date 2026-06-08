class Solution {

    List<List<Integer>> res = new ArrayList<>();
    List<Integer> path = new ArrayList<>();

    public List<List<Integer>> combinationSum(int[] nums, int target) {
        dfs(nums, 0, target);
        return res;
    }

    private void dfs(int[] nums, int start, int remain) {
        if (remain==0) {
            res.add(new ArrayList<>(path));
        }

        if (remain < 0) return;

        for (int i = start; i < nums.length; i++) {
            path.add(nums[i]);
            remain -= nums[i];

            dfs(nums, i, remain);

            var r = path.get(path.size() - 1);
            remain += r;
            path.remove(path.size() - 1);
        }
    }
}
