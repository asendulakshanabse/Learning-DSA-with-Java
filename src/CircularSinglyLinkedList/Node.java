package CircularSinglyLinkedList;

public class Node {
    private Integer value;
    private Node next;

    Node(Integer data, Node next) {
        this.value =  data;
        this.next = next;
    }

    public Integer getValue() {
        return value;
    }

    public Node getNext() {
        return next;
    }

    public void setValue(Integer value) {
        this.value = value;
    }

    public void setNext(Node next) {
        this.next = next;
    }
}
