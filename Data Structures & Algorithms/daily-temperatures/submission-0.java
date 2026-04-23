class Solution {
    public int[] dailyTemperatures(int[] t) {
        int[] res = new int[t.length];
        Stack<int[]> s = new Stack<>();

        for (int i = 0; i < t.length; i++) {
            while (!s.isEmpty() && s.peek()[0] < t[i]) {
                var c = s.pop();
                res[c[1]] = i - c[1];
            }

            s.push(new int[] {t[i], i});
        }

        return res;
    }
}
