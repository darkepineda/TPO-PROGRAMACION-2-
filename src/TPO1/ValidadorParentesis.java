package TPO1;

public class ValidadorParentesis {

    public static boolean parentesisBalanceados(String texto) {
        PilaEnlazada pila = new PilaEnlazada();

        for (int i = 0; i < texto.length(); i++) {
            String letra = texto.substring(i, i + 1);

            if (letra.equals("(")) {
                pila.push(letra);
            } else if (letra.equals(")")) {
                if (pila.isEmpty()) {
                    return false;
                }
                pila.pop();
            }
        }
        return pila.isEmpty();
    }
}