public class BubbleSort {

    static Node bubbleSort(Node head) {
        if (head == null) {
            return null;
        }
        Node end = null;
        boolean swapped;
        do {
            swapped = false;
            Node cur = head;
            while (cur.next != end) {
                if (cur.data > cur.next.data) {
                    int temp = cur.data;
                    cur.data = cur.next.data;
                    cur.next.data = temp;
                    swapped = true;
                }
                cur = cur.next;
            }
            end = cur;
        } while (swapped);
        return head;
    }

    public static void main(String[] args) {
        Node head = Node.fromArray(new int[]{64, 34, 25, 12, 22, 11, 90});

        Node.print("Before sorting", head);
        head = bubbleSort(head);
        Node.print("After sorting ", head);
    }
}
