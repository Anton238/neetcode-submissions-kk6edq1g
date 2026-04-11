class Solution {
    public boolean isPalindrome(String s) {
        int r = 0, l = s.length()-1;

        while (r < l) {
            char cR = s.charAt(r);
            char cL = s.charAt(l);

            if (!isLetter(cR)) {
                r++; continue;
            }

            if (!isLetter(cL)) {
                l--; continue;
            }

            if (Character.toLowerCase(cR) != Character.toLowerCase(cL)) return false;

            r++; l--;
        }

        return true;
    }

    boolean isLetter(char c) {
        return (c >= 'a' && c <= 'z') 
        || (c >= 'A' && c <= 'Z')
        || (c >= '0' && c <= '9');
    }
}
