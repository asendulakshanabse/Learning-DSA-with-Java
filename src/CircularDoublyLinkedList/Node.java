package CircularDoublyLinkedList;

public class Node {
    private Integer value;
    private Node prev;
    private Node next;

    Node(Integer data, Node prev, Node next) {
        this.value = data;
        this.prev = prev;
        this.next = next;
    }

    public Integer getValue() { return value; }
    public Node getPrev() { return prev; }
    public Node getNext() { return next; }

    public void setValue(Integer value) { this.value = value; }
    public void setNext(Node next) { this.next = next; }
    public void setPrev(Node prev) { this.prev = prev; }
}
