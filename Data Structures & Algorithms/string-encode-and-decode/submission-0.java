class Solution {

    public String encode(List<String> strs) {
        if (strs.size() == 0) return null;
        if (strs.size() == 1 && strs.get(0).equals("")) return "";

        int l = strs.size();

        String res = "";

        //7#hello10#world
        //7 + 5 + 2 + 1 = 15
        for (var str : strs) {
            res += str.length() + "#" + str;
        }

        return res;
    }

    public List<String> decode(String str) {
        if (str == null) return new ArrayList<String>();
        if (str.length() == 0) return List.of("");

        var res = new ArrayList<String>();

        for (int i = 0; i < str.length();) {
            String idxToStr = "";

            while (str.charAt(i) != '#') {
                idxToStr += str.charAt(i);
                i++;
            }
            i++;

            int idxTo = i + Integer.valueOf(idxToStr);

            String tmp = "";
            while (i < idxTo) {
                tmp += str.charAt(i);
                i++;
            }

            res.add(tmp);
        }

        return res;
    }
}
