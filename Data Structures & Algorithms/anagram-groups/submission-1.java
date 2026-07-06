class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        var map = new HashMap<String, List<String>>();

        for (var s : strs) {
            int[] ch = new int[26];

            for (var c : s.toCharArray()) {
                int i = c - 'a';
                ch[i]++;
            }

            var save = Arrays.toString(ch);
            var list = map.get(save);
            if (list == null) {
                list = new ArrayList<String>();
                list.add(s);
                map.put(save, list);
            } else {
                list.add(s);
            }
        }

        return map.entrySet().stream().map(e -> e.getValue()).toList();
    }
}
