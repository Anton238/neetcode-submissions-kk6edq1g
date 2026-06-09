class Solution {
    boolean[] used = new boolean[6];
    List<List<Integer>> res = new ArrayList<>();
    List<Integer> path = new ArrayList<>();

    public List<List<Integer>> permute(int[] nums) {
        dfs(nums, 0);
        return res;
    }

    private void dfs(int[] nums, int start) {
        if (path.size() == nums.length) {
            res.add(new ArrayList<>(path));
            return;
        }

        for (int i = start; i < nums.length; i++) {
            if (used[i]) continue;

            used[i] = true;
            path.add(nums[i]);
            dfs(nums, start);
            used[i] = false;
            path.remove(path.size() - 1);
        }
    }
}
