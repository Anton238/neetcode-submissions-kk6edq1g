class Solution {
    public int[][] kClosest(int[][] points, int k) {
        


        var q = new PriorityQueue<int[]>((a,b) -> { 
            int d1 = a[0]*a[0] + a[1]*a[1];
            int d2 = b[0]*b[0] + b[1]*b[1];

            return d2 - d1;
        });

        for (var p : points) {
            q.offer(p);

            if (q.size() > k) {
                q.poll();
            }
        }

        int[][] res = new int[k][2];
        k--;
        for(var n : q) {
            res[k] = n;
            k--;
        }

        return res;
    }
}
