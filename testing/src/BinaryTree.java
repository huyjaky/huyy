class BinaryTree {
    class Node {
        Integer data;
        Node next, left, right;
        Node (Integer d) {
            this.data = d;
            this.left = null;
            this.right = null;
            this.next = null;
        }
    }

    Node root;

    public Node add_node_on_tree (Node node, Integer data) {
        if (node == null) {
            return (new Node(data));
        } else {
            if (data <= root.data) {
                node.left = add_node_on_tree(node.left, data);
            } else {
                node.right = add_node_on_tree(node.right, data);
            }
            return node;
        }
    }

    public static void main(String[] args) {
        
    }
}