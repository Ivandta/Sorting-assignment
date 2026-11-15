public class InsertionSort {

    static Node insertionSort(Node head) {
        Node sorted = null;
        Node cur = head;
        while (cur != null) {
            Node next = cur.next;
            if (sorted == null || cur.data < sorted.data) {
                cur.next = sorted;
                sorted = cur;
            } else {
                Node prev = sorted;
                while (prev.next != null && prev.next.data <= cur.data) {
                    prev = prev.next;
                }
                cur.next = prev.next;
                prev.next = cur;
            }
            cur = next;
        }
        return sorted;
    }

    public static void main(String[] args) {
        Node head = Node.fromArray(new int[]{12, 11, 13, 5, 6, 7, 1});

        Node.print("Before sorting", head);
        head = insertionSort(head);
        Node.print("After sorting ", head);
    }
}
