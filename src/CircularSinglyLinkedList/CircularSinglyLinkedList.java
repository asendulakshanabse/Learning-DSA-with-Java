package CircularSinglyLinkedList;

public class CircularSinglyLinkedList {
    private Node tail;
    private int size;

    public CircularSinglyLinkedList() {
        tail = null;
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
        return tail.getNext().getValue(); // head is tail's next
    }

    public Integer last() {
        if (isEmpty()) {
            return null;
        }
        return tail.getValue();
    }

    public void addFirst(Integer data) {
        if (isEmpty()) {
            Node newNode = new Node(data, null);
            newNode.setNext(newNode); // points to itself
            tail = newNode;
        }
        else {
            Node newNode = new Node(data, tail.getNext());
            tail.setNext(newNode);
        }
        size++;
    }

    public void addLast(Integer data) {
        addFirst(data);
        tail = tail.getNext(); // move tail to the next last element
    }

    public Integer removeFirst() {
        if (isEmpty()) {
            return null;
        }
        Node head = tail.getNext();
        if (head == tail) { // Only one element in the list
            tail = null;
        } else {
            tail.setNext(head.getNext()); // Bypass the head
        }
        size--;
        return head.getValue();
    }

    public void removeLast() {
        if (isEmpty()) {
            return;
        }
        if (tail.getNext() == tail) { // Only one element
            tail = null;
        } else {
            Node current = tail;
            while (current.getNext() != tail) {
                current = current.getNext();
            }
            current.setNext(tail.getNext());
            tail = current;
        }
        size--;
    }

    public void addAtPosition(int position, Integer data) {
        if (position < 0 || position > size) {
            throw new IndexOutOfBoundsException("Invalid position");
        }

        if (position == 0) {
            addFirst(data);
        } else if (position == size) {
            addLast(data);
        } else {
            Node current = tail.getNext();
            for (int i = 0; i < position - 1; i++) {
                current = current.getNext();
            }
            Node newNode = new Node(data, current.getNext());
            current.setNext(newNode);
            size++;
        }
    }

    public Integer removeAtPosition(int position) {
        if (position < 0 || position >= size) {
            throw new IndexOutOfBoundsException("Invalid position");
        }

        if (position == 0) {
            return removeFirst();
        } else if (position == size - 1) {
            Integer value = tail.getValue();
            removeLast();
            return value;
        } else {
            Node current = tail.getNext();
            for (int i = 0; i < position - 1; i++) {
                current = current.getNext();
            }
            Node nodeToRemove = current.getNext();
            current.setNext(nodeToRemove.getNext());
            size--;
            return nodeToRemove.getValue();
        }
    }

    public void printList() {
        if (isEmpty()) {
            System.out.println("List is empty");
        } else {
            System.out.println("Traversing the circular list: ");
            Node current = tail.getNext(); // Start from head
            do {
                System.out.print(current.getValue() + " ");
                current = current.getNext();
            } while (current != tail.getNext());
            System.out.println("\nSize of the list: " + size);
        }
    }





}
