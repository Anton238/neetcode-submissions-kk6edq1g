class Solution {
    public int lengthOfLongestSubstring(String s) {
        if (s.length() < 2) return s.length();
       var map = new HashMap<Character, Integer>();
       map.put(s.charAt(0), 0);
       var res = 0;

       for (int l = 0, r = 1; r < s.length(); r++) {
        var rS = s.charAt(r);
        if (map.get(rS) != null) {
            l = Math.max(l, map.get(rS)+1);
        } 
                    map.put(rS, r);


        res = Math.max(res, r-l+1);
       } 

       return res;
    }
}
