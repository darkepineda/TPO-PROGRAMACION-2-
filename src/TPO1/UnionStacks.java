package TPO1;

public class UnionStacks {

    private static int countElements(ColaEnlazada queue) {
        ColaEnlazada auxQueue = new ColaEnlazada();
        int count = 0;

        while (!queue.isEmpty()) {
            int number = queue.dequeue();
            auxQueue.enqueue(number);
            count++;
        }
        while (!auxQueue.isEmpty()) {
            int number = auxQueue.dequeue();
            queue.enqueue(number);
        }
        return count;
    }

    public static PilaEnlazada union(PilaEnlazada p1, PilaEnlazada p2) {
        PilaEnlazada auxStack = new PilaEnlazada();
        PilaEnlazada pOut = new PilaEnlazada();

        while (!p1.isEmpty() && !p2.isEmpty()) {
            int size1 = countElements((ColaEnlazada) p1.top());
            int size2 = countElements((ColaEnlazada) p2.top());

            if (size1 >= size2) {
                auxStack.push(p1.pop());
            } else {
                auxStack.push(p2.pop());
            }
        }
        while (!p1.isEmpty()) {
            auxStack.push(p1.pop());
        }
        while (!p2.isEmpty()) {
            auxStack.push(p2.pop());
        }
        while (!auxStack.isEmpty()) {
            pOut.push(auxStack.pop());
        }
        return pOut;
    }
}