package CircularDoublyLinkedList;

public class CircularDoublyLinkedList {
    private Node tail;
    private int size;

    public CircularDoublyLinkedList() {
        tail = null;
        size = 0;
    }

    public int getSize() { return size; }
    public boolean isEmpty() { return size == 0; }


}
