class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) return false;

        int[] l = new int[26];

        for (int i = 0; i < s.length(); i++) {
            l[s.charAt(i) % 26] += 1;
            l[t.charAt(i) % 26] -= 1;
        }

        for (int n : l) {
            if (n != 0) return false;
        } 

        return true;
    }
}
