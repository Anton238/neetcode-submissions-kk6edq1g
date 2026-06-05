class Solution {
    public int findKthLargest(int[] nums, int k) {
        var q = new PriorityQueue<Integer>();

        for (var n : nums) {
            q.offer(n);

            if (q.size() > k) q.poll();
        }

        return q.peek();
    }
}
