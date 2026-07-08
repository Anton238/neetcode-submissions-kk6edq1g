class Solution {

    public String encode(List<String> strs) {
        var res = "";

        for (var s : strs) {
            res += s.length();
            res += "#";
            res += s;
        }

        return res;
    }

    public List<String> decode(String str) {
        var res = new ArrayList<String>();
        for (int i = 0; i < str.length(); i++) {
            var tmp = "";
            var numS = "";

            while (str.charAt(i) != '#') {
                numS += str.charAt(i);
                i++;
            }

            int num = Integer.valueOf(numS);

            if (num == 0) {
                res.add("");
                continue;
            }

                        i++;


            while (num > 0) {
                tmp += str.charAt(i);
                num--;
                if (num != 0) i++;
            }

            res.add(tmp);
        }

        return res;
    }
}
