package TPO1;

public class PilaEnlazada {

    private class Node {
        Object data;
        Node next;

        Node(Object data) {
            this.data = data;
        }
    }

    private Node top;

    public void push(Object o) {
        Node newNode = new Node(o);
        newNode.next = top;
        top = newNode;
    }

    public Object pop() {
        Object o = top.data;
        top = top.next;
        return o;
    }

    public Object top() {
        return top.data;
    }

    public boolean isEmpty() {
        return top == null;
    }
}