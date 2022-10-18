
public class BinaryTree {    
    Node root;
    
    public void add_root (Integer new_data) {
        if (root == null) {
            root = new Node(new_data);
            return;
        }
    }

    public static void main(String[] args) throws Exception {
        BinaryTree tree = new BinaryTree();
        tree.add_root(12); 
        tree.root.next = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.next = new Node(4);
        System.out.println(tree.root.data);
    }
}
