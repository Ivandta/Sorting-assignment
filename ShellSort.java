public class ShellSort {

    static Node shellSort(Node head) {
        int n = Node.length(head);

        for (int gap = n / 2; gap > 0; gap /= 2) {
            for (int i = gap; i < n; i++) {
                Node current = getNode(head, i);
                int temp = current.data;
                int j = i;

                while (j >= gap && getNode(head, j - gap).data > temp) {
                    getNode(head, j).data = getNode(head, j - gap).data;
                    j -= gap;
                }
                getNode(head, j).data = temp;
            }
        }
        return head;
    }

    static Node getNode(Node head, int index) {
        Node cur = head;
        for (int i = 0; i < index; i++) {
            cur = cur.next;
        }
        return cur;
    }

    public static void main(String[] args) {
        Node head = Node.fromArray(new int[]{23, 12, 1, 8, 34, 54, 2, 3});

        Node.print("Before sorting", head);
        head = shellSort(head);
        Node.print("After sorting ", head);
    }
}
