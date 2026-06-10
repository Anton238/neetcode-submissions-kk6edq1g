class PrefixTree {

    T root = new T();

    public PrefixTree() {

    }

    public void insert(String word) {
        T curr = root;
        for (char c : word.toCharArray()) {
            int i = c - 'a';
            if (curr.ts[i] == null) {
                T t = new T();
                curr.ts[i] = t;
            }

            curr = curr.ts[i];
        }

        curr.w = true;
    }

    public boolean search(String word) {
        T curr = root;
        for (char c : word.toCharArray()) {
            int i = c - 'a';
            if (curr.ts[i] == null) {
                return false;
            }

            curr = curr.ts[i];
        }

        return curr.w;
    }

    public boolean startsWith(String word) {
        T curr = root;
        for (char c : word.toCharArray()) {
            int i = c - 'a';
            if (curr.ts[i] == null) {
                return false;
            }

            curr = curr.ts[i];
        }

        return true;
    }

    private class T {
        T[] ts = new T[26];
        boolean w = false;
    }
}
