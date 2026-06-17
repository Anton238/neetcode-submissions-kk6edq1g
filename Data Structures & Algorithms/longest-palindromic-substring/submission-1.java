class Solution {
    int start = 0;
    int end = 0;
    int res = 0;
    public String longestPalindrome(String s) {
        if (s.length() == 1) return s;
        if (s.length() == 2 && s.charAt(0) == s.charAt(1)) return s;
        if (s.length() == 3 && s.charAt(0) == s.charAt(2)) return s;


        for (int i = 0; i < s.length(); i++) {
            expand(s,i,i);
            expand(s, i, i+1);
        }

        return s.substring(start, end);
    }

    void expand(String s, int l, int r) {
        var len = 0;
        while (l >= 0 && r < s.length()) {
            if (s.charAt(l) != s.charAt(r)) {
                break;
            }

            r++;
            l--;
        }

        len = r - l - 1;

        if (len > res) {
            res = len;
            start = l+1;
            end = r;
        }
    }
}
