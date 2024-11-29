package CircularSinglyLinkedList;

public class CircularSinglyLinkedListDemo {

    public static void main(String[] args) {
        CircularSinglyLinkedList c = new CircularSinglyLinkedList();
        c.addFirst(10);
        c.addFirst(20);
        c.addFirst(30);
        c.addFirst(40);
        c.addLast(3);
        c.addLast(4);
        c.addLast(5);
        c.addLast(6);
        c.printList();

        c.addAtPosition(2, 33);
        c.removeAtPosition(3);

        c.printList();
    }


}
