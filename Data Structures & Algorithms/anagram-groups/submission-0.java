class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        var map = new HashMap<String, List<String>>();
        for (String str : strs) {
            var arr = new int[26];

            for (int i = 0; i < str.length(); i++) {
                arr[str.charAt(i) % 26]++;
            }

            var key = Arrays.toString(arr);
            if (map.get(key) == null) {
                var newList = new ArrayList<String>();
                newList.add(str);
                map.put(key, newList);
            } else {
                map.get(key).add(str);
            }
        }

        return map.entrySet().stream().map(e -> e.getValue()).toList();
    }
}
