public class SelectionSort {

    static Node selectionSort(Node head) {
        for (Node i = head; i != null && i.next != null; i = i.next) {
            Node min = i;
            for (Node j = i.next; j != null; j = j.next) {
                if (j.data < min.data) {
                    min = j;
                }
            }
            if (min != i) {
                int temp = i.data;
                i.data = min.data;
                min.data = temp;
            }
        }
        return head;
    }

    public static void main(String[] args) {
        Node head = Node.fromArray(new int[]{29, 10, 14, 37, 13, 8, 51});

        Node.print("Before sorting", head);
        head = selectionSort(head);
        Node.print("After sorting ", head);
    }
}
