class Solution {
    List<List<Integer>> res = new ArrayList<>();
    List<Integer> path = new ArrayList<>();

    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates);
        dfs(candidates, 0, target);
        return res;
    }

    private void dfs(int[] can, int start, int remains) {
        if (remains == 0) {
            res.add(new ArrayList<>(path));
            return;
        }

        if (remains < 0) {
            return;
        }

        for (int i = start; i < can.length; i++) {
            if (i > start && can[i] == can[i-1]) {
                continue;
            }

            path.add(can[i]);
            dfs(can, i+1,remains-can[i]);

            var r = path.get(path.size()-1);
            path.remove(path.size()-1);
        }
    }

}
