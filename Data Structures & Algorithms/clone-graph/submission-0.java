/*
Definition for a Node.
class Node {
    public int val;
    public List<Node> neighbors;
    public Node() {
        val = 0;
        neighbors = new ArrayList<Node>();
    }
    public Node(int _val) {
        val = _val;
        neighbors = new ArrayList<Node>();
    }
    public Node(int _val, ArrayList<Node> _neighbors) {
        val = _val;
        neighbors = _neighbors;
    }
}
*/

class Solution {
    public Node cloneGraph(Node node) {
        return dfs(node, new HashMap<Node, Node>());
    }

    Node dfs(Node node, HashMap<Node, Node> clones) {
        if (node == null) return null;

        var copy = clones.get(node);

        if (copy != null) {
            return copy;
        }
        copy = new Node(node.val);
            clones.put(node, copy);

        for (var c : node.neighbors) {
            copy.neighbors.add(dfs(c, clones));
        }
        

        return copy;
    }
}