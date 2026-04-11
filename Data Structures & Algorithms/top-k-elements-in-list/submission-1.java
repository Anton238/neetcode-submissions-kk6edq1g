class Solution {
    public int[] topKFrequent(int[] nums, int k) {

        if (k == 0 || nums.length == 0) return new int[] {};

        var map = new HashMap<Integer, Integer>();

        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        List<Integer>[] freq = new List[nums.length + 1];

        for (var e : map.entrySet()) {
            var f = e.getValue();
            var v = e.getKey();

            if (freq[f] != null) {
                freq[f].add(v);
            } else {
                var list = new ArrayList<Integer>();
                list.add(v);

                freq[f] = list;
            }
        }

        int[] res = new int[k];
        int idx = 0;

        for (int i = freq.length-1; i > 0; i--) {
            if (freq[i] == null) continue;

            for (var num : freq[i]) {
                res[idx] = num;
                idx++;

                if (idx == res.length) return res;
            }
        }
        return res;
    }
}
