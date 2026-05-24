class TimeMap {

    HashMap<String, List<P>> map = new HashMap<>(); 

    public TimeMap() {
        
    }
    
    public void set(String key, String value, int timestamp) {
        var imap = map.get(key);

        if (imap == null) {
            imap = new ArrayList<>();
            map.put(key, imap);
        }

        imap.add(new P(timestamp, value));
    }
    
    public String get(String key, int timestamp) {
        var imap = map.get(key);

        if (imap == null) return "";

        int l = 0, r = imap.size()-1, m = 0;
        String res = "";

        while (l <= r) {
            m = l + (r-l)/2;

            var arr = imap.get(m);

            if (arr.ts == timestamp) return arr.v;

            if (arr.ts < timestamp) {
                res = arr.v;
                l = m+1;
            } else {
                r = m-1;
            }
        }

        return res;

    }

    class P {
        public P(int ts, String v) {
            this.ts = ts;
            this.v=v;
        }
        public int ts;
        public String v;
    }
}
