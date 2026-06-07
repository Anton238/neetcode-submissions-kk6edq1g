class Solution {
    List<List<Integer>> res = new ArrayList<>();
    List<Integer> path = new ArrayList<>();

    public List<List<Integer>> subsets(int[] nums) {
        dfs(nums, 0);
        return res;
    }

    private void dfs(int[] nums, int start) {
        res.add(new ArrayList<>(path));

        for (int i = start; i < nums.length; i++) {
            path.add(nums[i]);
            dfs(nums, i+1);
            path.remove(path.size()-1);
        }
    }
}
