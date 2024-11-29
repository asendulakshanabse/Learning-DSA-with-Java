package Stack;

public class Stack {
    int arr[];
    int top;
    int capacity;

    Stack(int size){
        arr = new int[size];
        capacity = size;
        top = -1; // if stack is empty top -> -1
    }

    public boolean isFull() {
        return top + 1 == capacity;
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public void push(int x) {
        if (isFull()) {
            System.out.println("stack is already full.");
        }
        else {
            top++;
            arr[top] = x;
            System.out.println("inserting: " + x);
        }
    }

    public int pop() {
        if (isEmpty()) {
            System.out.println("stack is empty");
        }
        else {
            int popItem = arr[top];
            // System.out.println("removing: " + arr[top]);
            top--;
        }
        return top;
    }

    public int peek() {
        return arr[top];
    }

    public int getSize() {
        return top + 1;
    }

    public void printStack() {
        System.out.println("stack: ");
        for (int i = 0; i <= top; i++) {
            System.out.print(i + " ");
        }
    }



    public static void main(String[] args) {
        Stack stack = new Stack(5);

    }





}
