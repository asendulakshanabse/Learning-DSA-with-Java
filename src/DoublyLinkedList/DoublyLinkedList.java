package DoublyLinkedList;

public class DoublyLinkedList {
    private Node head;
    private Node tail;
    private int size;

    public DoublyLinkedList() {
        head = new Node(null, null, null);
        tail = new Node(null, head, null);
        head.setNext(tail);

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
        return head.getNext().getValue();
    }

    public Integer last() {
        if (isEmpty()) {
            return null;
        }
        return tail.getPrev().getValue();
    }

    public void addFirst(Integer data) {
        addBetween(data, head, head.getNext());
    }

    public void addLast(Integer data) {
        addBetween(data, tail.getPrev(), tail);
    }

    public void addAtPosition(int position, Integer data) {
        if (position < 0 || position > size) {
            throw new IndexOutOfBoundsException("position out of bounds");
        }
        Node current = head;
        for (int i = 0; i < position; i++) {
            current = current.getNext();
        }
        addBetween(data, current, current.getNext());
    }

    private void addBetween(Integer data, Node prevAcc, Node nextAcc) {
        Node newNode = new Node(data, prevAcc, nextAcc);
        prevAcc.setNext(newNode);
        nextAcc.setPrev(newNode);
        size++;
    }

    public Integer removeFirst() {
        if (isEmpty()) {
            return null;
        }
        return remove(head.getNext());
    }

    public Integer removeLast() {
        if (isEmpty()) {
            return null;
        }

        return remove(tail.getPrev());
    }

    public Integer removeAtPosition(int position) {
        if (position < 0 || position >= size) {
            throw new IndexOutOfBoundsException("Position out of bounds");
        }
        Node current = head.getNext();
        for (int i = 0; i < position; i++) {
            current = current.getNext();
        }
        return remove(current);
    }

    private Integer remove(Node node) {
        Node prevAcc = node.getPrev();
        Node nextAcc = node.getNext();

        prevAcc.setNext(nextAcc);
        nextAcc.setPrev(prevAcc);

        size--;
        return node.getValue();
    }

    public void printList() {
        if (isEmpty()) {
            System.out.println("list is empty");
        }
        else {
            System.out.println("traversing the list: ");

            Node start = head.getNext();

            while (start != tail) {
                System.out.println(start.getValue() + " ");
                start = start.getNext();
            }
            System.out.println("\nsize of the list: " + size);
        }
    }









}
