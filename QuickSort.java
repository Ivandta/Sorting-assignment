public class QuickSort {

    static Node quickSort(Node head) {
        if (head == null || head.next == null) {
            return head;
        }
        Node tail = head;
        while (tail.next != null) {
            tail = tail.next;
        }
        quickSort(head, tail);
        return head;
    }

    static void quickSort(Node start, Node end) {
        if (start == null || end == null || start == end) {
            return;
        }

        Node pivot = partition(start, end);

        if (pivot != start) {
            Node prev = start;
            while (prev.next != pivot) {
                prev = prev.next;
            }
            quickSort(start, prev);
        }
        if (pivot != end) {
            quickSort(pivot.next, end);
        }
    }

    static Node partition(Node start, Node end) {
        int pivot = end.data;
        Node store = start;
        for (Node cur = start; cur != end; cur = cur.next) {
            if (cur.data < pivot) {
                swap(store, cur);
                store = store.next;
            }
        }
        swap(store, end);
        return store;
    }

    static void swap(Node a, Node b) {
        int temp = a.data;
        a.data = b.data;
        b.data = temp;
    }

    public static void main(String[] args) {
        Node head = Node.fromArray(new int[]{10, 7, 8, 9, 1, 5, 33});

        Node.print("Before sorting", head);
        head = quickSort(head);
        Node.print("After sorting ", head);
    }
}
