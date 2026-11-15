public class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
    }

    static Node fromArray(int[] values) {
        Node head = null;
        Node tail = null;
        for (int value : values) {
            Node node = new Node(value);
            if (head == null) {
                head = node;
            } else {
                tail.next = node;
            }
            tail = node;
        }
        return head;
    }

    static int length(Node head) {
        int count = 0;
        for (Node cur = head; cur != null; cur = cur.next) {
            count++;
        }
        return count;
    }

    static void print(String label, Node head) {
        System.out.print(label + ": ");
        for (Node cur = head; cur != null; cur = cur.next) {
            System.out.print(cur.data);
            if (cur.next != null) {
                System.out.print(" -> ");
            }
        }
        System.out.println();
    }
}
