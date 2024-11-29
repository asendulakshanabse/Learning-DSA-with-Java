package SinglyLinkedList;

public class SinglyLinkedList {
    private Node head;
    private int size;

    public SinglyLinkedList() {
        head = null;
        size = 0;
    }

    public int getSize() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public Integer first() {
        if (isEmpty()) {
            return null;
        }
        return head.getValue();
    }

    public Integer last() {
        if (isEmpty()) {
            return null;
        }
        Node current = head;
        while (current.getNext() != null) {
            current = current.getNext();
        }
        return current.getValue();
    }

    public void addFirst(Integer data) {
        Node newNode = new Node(data, head);
        head = newNode;
        size++;
    }

    public void addLast(Integer data) {
        Node newNode = new Node(data, null);
        if (isEmpty()) {
            System.out.println("list is empty adding to head");
            addFirst(data);
        }
        else {
            Node current = head;
            while (current.getNext() != null) {
                current = current.getNext();
            }
            current.setNext(newNode);
            size++;
        }
    }

    public void addAtPosition(int position, Integer data) {
        if (position < 0 || position > size) {
            throw new IndexOutOfBoundsException("Position out of bounds");
        }
        if (position == 0) {
            addFirst(data);
        }
        else {
            Node current = head;
            for (int i = 0; i < position - 1; i++) {
                current = current.getNext();
            }
            Node newNode = new Node(data, current.getNext());
            current.setNext(newNode);
            size++;
        }
    }

    public Integer removeFirst() {
        if (isEmpty()) {
            return null;
        }
        Integer value = head.getValue();
        head = head.getNext();
        size--;
        return value;
    }

    public Integer removeAtPosition(int position) {
        if (position < 0 || position >= size) {
            throw new IndexOutOfBoundsException("Position out of bounds");
        }
        if (position == 0) {
            return removeFirst();
        }
        Node current = head;
        for (int i = 0; i < position - 1; i++) {
            current = current.getNext();
        }
        Integer value = current.getNext().getValue();
        current.setNext(current.getNext().getNext());
        size--;
        return value;
    }



    public void printList() {
        if (isEmpty()) {
            System.out.println("list is empty");
        }
        else {
            System.out.println("traversing the list: ");
            Node current = head;
            while (current != null) {
                System.out.print(current.getValue() + " ");
                current = current.getNext();
            }
            System.out.println("\nsize of the list: " + size);
        }
    }









}
