class WordDictionary {

    public WordDictionary() {

    }

    T root = new T();

    public void addWord(String word) {
        T curr = root;

        for (char c : word.toCharArray()) {
            int i = c - 'a';

            if (curr.ts[i] == null) {
                curr.ts[i] = new T();
            }

            curr = curr.ts[i];
        }

        curr.end = true;
    }

    public boolean search(String word) {
        return dfs(word, root, 0);

    }

    private boolean dfs(String word, T curr, int start) {
        for (int s = start; s < word.length(); s++) {
            char c = word.charAt(s);
            int i = c - 'a';

            if (c == '.') {
                for (T td : curr.ts) {
                    if (td != null && dfs(word, td, s+1)) {
                        return true;
                    }
                }
                                    return false;

            }

            if (curr.ts[i] == null) {
                return false;
            }

            curr = curr.ts[i];
        }
        return curr.end;
    }

    private class T {
        boolean end = false;
        T[] ts = new T[26];
    }
}
