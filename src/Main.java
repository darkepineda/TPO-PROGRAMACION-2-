import TPO1.*;
import java.util.Scanner;

public class Main {

    private static ColaEnlazada createQueue(int amount) {
        ColaEnlazada queue = new ColaEnlazada();
        for (int i = 1; i <= amount; i++) {
            queue.enqueue(i);
        }
        return queue;
    }
    public static void main(String[] args) {

        // ---------- Ejercicio 1 el de parentesis ----------
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese una cadena: ");
        String texto = sc.nextLine();

        ValidadorParentesis validador = new ValidadorParentesis();
        boolean resultado = validador.parentesisBalanceados(texto);
        System.out.println(resultado);

        // ejercicio 2

        PilaEnlazada p1 = new PilaEnlazada();
        p1.push(createQueue(1));
        p1.push(createQueue(3));

        PilaEnlazada p2 = new PilaEnlazada();
        p2.push(createQueue(2));
        p2.push(createQueue(4));

        PilaEnlazada result = UnionStacks.union(p1, p2);
        while (!result.isEmpty()) {
            ColaEnlazada queue = (ColaEnlazada) result.pop();
            int size = 0;
            while (!queue.isEmpty()) {
                queue.dequeue();
                size++;
            }
            System.out.println("Tamaño de cola" + size);
        }
    }
}

