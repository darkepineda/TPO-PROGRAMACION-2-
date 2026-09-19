package TPO1;

public class ColaEnlazada {

    private class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }

    private Node front;
    private Node back;

    public void enqueue(int n) {
        Node newNode = new Node(n);
        if (isEmpty()) {
            front = newNode;
        } else {
            back.next = newNode;
        }
        back = newNode;
    }

    public int dequeue() {
        int n = front.data;
        front = front.next;
        if (front == null) {
            back = null;
        }
        return n;
    }

    public boolean isEmpty() {
        return front == null;
    }
}