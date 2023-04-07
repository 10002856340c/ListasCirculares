
package Punto1;


public class main {
    public static void main(String[] args) {
        Nodo cabeza = new Nodo();
        cabeza.info = 15;
        Nodo recorrido = cabeza;

        for (int i = 1; i <= 5; i++) {
            int nuevoValor = recorrido.info + 3;
            Nodo nuevoNodo = new Nodo();
            nuevoNodo.info = nuevoValor;

            recorrido.sig = nuevoNodo;
            recorrido = nuevoNodo;
        }
        recorrido.sig = cabeza; // Hacer que la lista sea circular

        recorrido = cabeza;
        do {
            System.out.println(recorrido.info);
            recorrido = recorrido.sig;
        } while (recorrido != cabeza);
    }
}
