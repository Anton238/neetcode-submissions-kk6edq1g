class Solution {
    public boolean isValid(String s) {
        var st = new Stack<Character>();

        int cnt = 0;

        for (var ch : s.toCharArray()) {
            if (ch == '{' || ch == '[' || ch == '(') {
                st.push(op(ch));
                cnt++;
            }
            else {
                cnt--;
                if (st.isEmpty() || st.pop() != ch) return false;
                }
        }

        return cnt == 0;
    }

    private char op(char ch) {
        if (ch == '{') return '}';
        if (ch == '[') return ']';
        if (ch == '(') return ')';

        return ' ';
    }
}
