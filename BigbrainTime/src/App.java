

public class App {
    
    class Node {
        int data;
        Node next, prev;
        Node (int data) {
            this.data = data;
            this.next = null;
            this.prev = null;
        }
    }

    Node head;

    public void add_node (Integer new_data) {
        if (head == null) {
            head = new Node(new_data);
            return;
        }
        Node new_node = new Node(new_data);
        Node current_Node = head;
        while (current_Node.next != null) {
            current_Node = current_Node.next;
        }
        new_node.prev = current_Node;
        current_Node.next = new_node;
        return;
    }
    
    public void remove_node (Integer key) {
        if (head == null) {
            System.out.println("node dau khong the la null!");
            return;
        }
        Node current_Node = head;
        while (current_Node.data != key) {
            current_Node = current_Node.next;
        }
        Node prev_node = current_Node.prev;
        Node next_node = current_Node.next;

        if (head == current_Node) {
            head = current_Node.next;
            current_Node.next = null;
            head.prev = null;
        } else {
            prev_node.next = next_node;
            current_Node.prev = prev_node;
            current_Node.next = null;
            current_Node.prev = null;
        }
    }
    
    public void print_node_list () {
        Node current_node = head;
        while (current_node != null) {
            System.out.println(current_node.data);
            current_node = current_node.next;
        }
    }

    
    
    public static void main(String[] args) throws Exception {
        Solution app = new Solution();
        app.add_node(12);
        app.add_node(133);
        app.print_node_list();
        System.out.println("-------------");
        app.remove_node(133);
        app.print_node_list();

    }
}
