package DoublyLinkedList;

public class DoublyLinkedListDemo {
    public static void main(String[] args) {
        DoublyLinkedList d = new DoublyLinkedList();

        d.addFirst(1);
        d.addFirst(2);
        d.addFirst(3);
        d.addFirst(4);
        d.addLast(10);
        d.addLast(20);
        d.addLast(30);
        d.addLast(40);
        d.printList();

        d.addAtPosition(3, 5);
        d.printList();

        d.removeAtPosition(3);
        d.printList();

        d.removeFirst();
        d.printList();

        d.removeLast();
        d.printList();

    }
}
