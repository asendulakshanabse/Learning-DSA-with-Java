package Queue;

/*
* enqueue(element) - add element to queue - work with rear
* dequeue() - remove and return the first element s the queue or return null if empty - work with front
* first() - returns the first element without removing it
* size() - returns number of elements in the queue
* isEmpty() - return true if queue is empty
* */

public class Queue {
    int front;
    int rear;
    int capacity;
    int numOfItems;
    int QueueArr[];

    public Queue(int size) {
        QueueArr = new int[size];
        front = 0;
        rear = -1;

        capacity = size;
    }

    public boolean  isFull() {
        return rear == capacity;
    }

    public boolean isEmpty() {
        return front > rear;
    }

    public void enqueue(int x) {
        if (isFull()) {
            System.out.println("queue is already full.");
        }
        else {
            rear++;
            QueueArr[rear] = x;
        }
    }

    public void dequeue() {
        if (isEmpty()) {
            System.out.println("queue is empty");
        }
        else {
            front ++;
        }
    }

    public int getSize() {
        return rear - front + 1;
    }

    public void displayQueue() {
        if (isEmpty()) {
            System.out.println("Queue is empty.");
        } else {
            System.out.println("Queue elements:");
            for (int i = front; i <= rear; i++) {
                System.out.print(QueueArr[i] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Queue queue = new Queue(5);

        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);
        queue.enqueue(4);
        queue.displayQueue();
        queue.dequeue();
        queue.displayQueue();
    }

}
