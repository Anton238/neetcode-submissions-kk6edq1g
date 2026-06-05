class Solution {
    public int lastStoneWeight(int[] stones) {
        var q = new PriorityQueue<Integer>((a, b) -> b - a);

        for (var s : stones) {
            q.offer(s);
        }

        while (q.size() > 0) {
            var f = q.poll();

            if (q.size() == 0) return f;

            var s = q.poll();

            var n = f - s;

            if (n != 0) {
                q.offer(n);
            }
        }

        return 0;
     }
}
